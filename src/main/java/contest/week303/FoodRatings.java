package contest.week303;

import com.fasterxml.jackson.core.type.TypeReference;
import util.Func;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/contest/weekly-contest-303/problems/food-ratings/">Food Ratings</a>
 */
public class FoodRatings {

    private final Map<String, Food> menu;
    private final Map<String, PriorityQueue<Food>> cuisinesFood;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        this.menu = new HashMap<>(foods.length);
        this.cuisinesFood = new HashMap<>(cuisines.length);

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            Food f = new Food(food, cuisine, rating);
            menu.put(f.name, f);
            cuisinesFood.computeIfAbsent(cuisine, (key) -> new PriorityQueue<>((f1, f2) -> {
                if (f1.rating == f2.rating) {
                    return f1.name.compareTo(f2.name);
                }
                return f2.rating - f1.rating;
            })).add(f);
        }
    }

    public void changeRating(String food, int newRating) {
        Food f = menu.get(food);
        cuisinesFood.get(f.cuisine).remove(f);

        f.rating = newRating;
        cuisinesFood.get(f.cuisine).add(f);
    }

    @SuppressWarnings("ConstantConditions")
    public String highestRated(String cuisine) {
        return cuisinesFood.get(cuisine).peek().name;
    }

    public static class Food {
        String name;
        String cuisine;
        int rating;

        public Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }

    @SuppressWarnings({"unchecked", "SuspiciousToArrayCall", "ToArrayCallWithZeroLengthArrayArgument", "ConstantConditions"})
    public static List<String> compile(String input) {
        List<String> results = new ArrayList<>();

        String methodInput = input.split("\n")[0];
        String argsInput = input.split("\n")[1];
        List<Object> methods = Func.jsonToObject(methodInput, new TypeReference<List<Object>>() {});
        List<Object> args = Func.jsonToObject(argsInput, new TypeReference<List<Object>>() {});

        FoodRatings fr = null;
        for (int i = 0; i < methods.size(); i++) {
            Object method = methods.get(i);
            Object arg = args.get(i);

            if (Objects.equals("FoodRatings", method)) {
                List<Object> foods = (List<Object>)((List<Object>)arg).get(0);
                List<Object> cuisines = (List<Object>)((List<Object>)arg).get(1);
                List<Object> ratings = (List<Object>)((List<Object>)arg).get(2);
                fr = new FoodRatings(foods.toArray(new String[foods.size()]), cuisines.toArray(new String[cuisines.size()]), ratings.stream().mapToInt(o -> (int)o).toArray());
                results.add(null);
            } else if (Objects.equals("changeRating", method)) {
                String food = ((List<Object>)arg).get(0).toString();
                int newRating = (int)((List<Object>)arg).get(1);
                fr.changeRating(food, newRating);
                results.add(null);
            } else if (Objects.equals("highestRated", method)) {
                String cuisine = ((List<Object>) arg).get(0).toString();
                String highestRated = fr.highestRated(cuisine);
                results.add(highestRated);
            }
        }

        return results;
    }
}
