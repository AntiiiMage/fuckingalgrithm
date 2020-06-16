package xuz.play.algrithm.dp;

/**
 * Created by XuMac on Jun1620.
 */
public class knapsack01 {


    /**
     * @param W
     * @param N
     * @param weights
     * @param values  有N件物品和一个容量为W的宝贝，第i件物品的重量是 weights[i], 价值是 values[i]
     * @return 背包能装入的最大价值
     */
    public int maxValue(int W, int N, int[] weights, int[] values) {

        // dp[i][j] 前 i 个物品放入容量为j的背包最大价值
        int[][] dp = new int[N + 1][W + 1];
        // dp[0][] = 0;
        // dp[][0] = 0;

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < W + 1; j++) {

                // 第 i 个物品重量大于当前容量，不放
                if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    //不放背包和放入背包的最大值
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[j - 1]] + values[i - 1]);
                }
            }
        }

        int maxValue = dp[N][W];
        return maxValue;

    }

}
