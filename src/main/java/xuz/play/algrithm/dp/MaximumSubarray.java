package xuz.play.algrithm.dp;

/**
 * Created by XuMac on Jun1620.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int[] dp = new int[n];
        dp[0] = nums[0];

        //状态转移方程
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }

        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            res = Math.max(dp[i], res);
        }

        return res;
    }

}
