package xuz.play.algrithm.dp;

import java.util.Arrays;

/**
 * Created by XuMac on Apr1820.
 * https://leetcode.com/problems/maximum-subarray/
 * 53 Maximum Subarray
 *
 */
public class CoinChange {


    public int coinChangeBottomUp(int[] coins, int amount) {

        int max = amount + 1;
        int[] cache = new int[amount + 1];
        Arrays.fill(cache, max);
        cache[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    cache[i] = Math.min(cache[i], cache[i - coins[j]] + 1);
                }
            }
        }

        return cache[amount] > amount ? -1 : cache[amount];
    }

    // Top to down
    public int coinChangeTopDown(int[] coins, int amount) {

        return helper(new int[amount], coins, amount);
    }

    private int helper(int[] cache, int[] coins, int amount) {

        if (amount < 0) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }


        if (cache[amount - 1] != 0) {
            return cache[amount - 1];
        }

        int ans = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subMin = helper(cache, coins, amount - coin);
            if (subMin == -1) {
                continue;
            }

            ans = Math.min(subMin + 1, ans);
        }
        cache[amount - 1] = ans == Integer.MAX_VALUE ? -1 : ans;
        return ans;
    }


    // brutal way
    public int coinChange1(int[] coins, int amount) {
        if (0 == amount) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int subMin = coinChange1(coins, amount - coins[i]);
            if (subMin == -1) {
                continue;
            }
            ans = Math.min(ans, subMin + 1);
        }

        if (ans == Integer.MAX_VALUE) {
            return -1;
        }

        return ans;
    }

}
