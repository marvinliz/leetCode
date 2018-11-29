package dynamicprogramming;

/**
 * Palindromic Substrings
 *
 * @author LiDaQian
 * @see <a href="https://leetcode.com/problems/palindromic-substrings/description/">source</a>
 */
public class PalindromicSubstrings {
    private int count = 0;

    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            foundPalindrome(s, i, i);
            foundPalindrome(s, i, i + 1);
        }

        return count;
    }

    private void foundPalindrome(String s, int left, int right) {
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}
