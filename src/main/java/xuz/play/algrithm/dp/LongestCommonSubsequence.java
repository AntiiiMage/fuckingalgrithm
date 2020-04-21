package xuz.play.algrithm.dp;

/**
 * Created by XuMac on Apr1920.
 * <p>
 * https://leetcode.com/problems/longest-common-subsequence/
 */
public class LongestCommonSubsequence {


    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length();
        int l2 = text2.length();

        // cahce[i][j] means the longest-common-subsequence of text1[0,i] and text2[0,j]
        int[][] cache = new int[l1 + 1][l2 + 1];
        for (int i = 1; i <= l1; i++) {
            for (int j = 1; j <= l2; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    cache[i][j] = cache[i - 1][j - 1] + 1;
                } else {
                    cache[i][j] = Math.max(cache[i][j - 1], cache[i - 1][j]);
                }
            }
        }
        return cache[l1 ][l2];
    }

}
