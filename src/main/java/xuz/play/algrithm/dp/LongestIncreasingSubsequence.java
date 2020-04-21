package xuz.play.algrithm.dp;

/**
 * Created by XuMac on Apr1920.
 *
 * 解决两个字符串的动态规划问题，一般都是用两个指针 i,j 分别指向两个字符串的最后，然后一步步往前走，缩小问题的规模。
 *
 * 第一步，一定要明确 dp 数组的含义。对于两个字符串的动态规划问题，套路是通用的.
 * 其中，dp[i][j] 的含义是：对于 s1[1..i] 和 s2[1..j]，它们的 LCS 长度是 dp[i][j]
 *
 * 第二步，定义 base case。
 *
 * 第三步，找状态转移方程
 * 用两个指针 i 和 j 从后往前遍历 s1 和 s2，如果 s1[i]==s2[j]，那么这个字符一定在 lcs 中
 * 否则的话，s1[i] 和 s2[j] 这两个字符至少有一个不在 lcs 中，需要丢弃一个
 *
 * 找状态转移方程的方法是，思考每个状态有哪些「选择」，只要我们能用正确的逻辑做出正确的选择，算法就能够正确运行
 *
 */
public class LongestIncreasingSubsequence {


    public int lengthOfLIS(int[] nums) {

        if (null == nums || nums.length == 0) {
            return 0;
        }

        // The cache[i] means the longest increase subsequence that end at nums[i]
        int[] cache = new int[nums.length];
        cache[0] = 1;
        int result = 1;

        // update the cache[i], from 0 - nums.leng
        for (int i = 0; i < nums.length; i++) {
            int ans = 1;

            // loop check the max lengh from 0 - i, update only num[j] < num[i]
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    ans = Math.max(ans, cache[j] + 1);
                }
            }
            cache[i] = ans;
            result = Math.max(result, ans);
        }

        return result;
    }
}
