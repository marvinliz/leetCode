package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Valid Parentheses
 *
 * @see <a href="https://leetcode.com/problems/valid-parentheses/description/">source</a>
 * @author LiDaQian
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        for (char c : s.toCharArray()) {
            if (brackets.containsKey(c)) {
                if (stack.empty()) {
                    return false;
                }
                Character leftChar = stack.pop();
                if (leftChar != brackets.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.empty();
    }
}
