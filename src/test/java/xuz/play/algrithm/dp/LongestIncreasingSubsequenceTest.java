package xuz.play.algrithm.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by XuMac on Apr1920.
 */
public class LongestIncreasingSubsequenceTest {

    private LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

    @Test
    public void lengthOfLIS() throws Exception {

        int[] inputs = new int[]{1, 2, 3, 2, 4};

        Assert.assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(inputs));

    }

}