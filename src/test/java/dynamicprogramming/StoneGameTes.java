package dynamicprogramming;

import org.junit.Assert;
import org.junit.Test;

/**
 * Stone Game
 *
 * @see <a href="https://leetcode.com/problems/stone-game/description/">source</a>
 * @author LiDaQian
 */
public class StoneGameTes {

    @Test
    public void test() {
        int[] piles = new int[]{3, 2, 10, 4};

        Assert.assertTrue(new StoneGame().stoneGame(piles));
    }
}
