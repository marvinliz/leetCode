package dynamicprogramming;

/**
 * Counting Bits
 *
 * <a href="https://leetcode.com/problems/counting-bits/description/">source</a>
 * @author LiDaQian
 */
public class CountingBits {

    public int[] countBits(int num) {
        int result[] = new int[num + 1];

        // 要计算7（111）的bitCount，由于之前已经计算过 3（11）的BitCount
        // 所以7（111）bitCount = 3（11）BitCount + 1（1）BitCount
        // 其中 3(11)bitCount = 1(1)BitCount + 1(1)BitCount
        // 确实是可以用动态规划来解决
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }

        return result;
    }
}
