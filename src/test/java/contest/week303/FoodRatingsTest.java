package contest.week303;

import com.fasterxml.jackson.core.type.TypeReference;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import util.Func;

import java.util.Arrays;
import java.util.List;

public class FoodRatingsTest {

    @Test
    public void test() {
        for (Pair<String, String> input : Arrays.asList(
                new Pair<>(
                        "[\"FoodRatings\",\"changeRating\",\"highestRated\",\"changeRating\",\"changeRating\",\"highestRated\"]\n" +
                        "[[[\"czopaaeyl\",\"lxoozsbh\",\"kbaxapl\"],[\"dmnuqeatj\",\"dmnuqeatj\",\"dmnuqeatj\"],[11,2,15]],[\"czopaaeyl\",12],[\"dmnuqeatj\"],[\"kbaxapl\",8],[\"lxoozsbh\",5],[\"dmnuqeatj\"]]",
                        "[null,null,\"kbaxapl\",null,null,\"czopaaeyl\"]"
                ),
                new Pair<>(
                        "[\"FoodRatings\", \"highestRated\", \"highestRated\", \"changeRating\", \"highestRated\", \"changeRating\", \"highestRated\"]\n" +
                                "[[[\"kimchi\", \"miso\", \"sushi\", \"moussaka\", \"ramen\", \"bulgogi\"], [\"korean\", \"japanese\", \"japanese\", \"greek\", \"japanese\", \"korean\"], [9, 12, 8, 15, 14, 7]], [\"korean\"], [\"japanese\"], [\"sushi\", 16], [\"japanese\"], [\"ramen\", 16], [\"japanese\"]]",
                        "[null, \"kimchi\", \"ramen\", null, \"sushi\", null, \"ramen\"]"
                )
        )) {
            List<String> result = FoodRatings.compile(input.getKey());
            Assert.assertEquals(Func.jsonToObject(input.getValue(), new TypeReference<List<String>>(){}), result);
        }
    }
}