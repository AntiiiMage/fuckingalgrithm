package xuz.play.algrithm.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by XuMac on Apr1820.
 */
public class CoinChangeTest {
    @Test
    public void coinChange1() throws Exception {
        int[] coins = new int[]{1, 2, 5};
        CoinChange coinChange = new CoinChange();
        Assert.assertEquals(2, coinChange.coinChange1(coins, 10));
        Assert.assertEquals(2, coinChange.coinChangeTopDown(coins, 10));
        Assert.assertEquals(2, coinChange.coinChangeBottomUp(coins, 10));

        Assert.assertEquals(3, coinChange.coinChange1(coins, 11));
        Assert.assertEquals(3, coinChange.coinChangeTopDown(coins, 11));
        Assert.assertEquals(3, coinChange.coinChangeBottomUp(coins, 11));
    }

}