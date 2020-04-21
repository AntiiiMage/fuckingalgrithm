package xuz.play.algrithm.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by XuMac on Apr1920.
 */
public class LongestCommonSubsequenceTest {
    @Test
    public void longestCommonSubsequence() throws Exception {

        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        Assert.assertEquals(3, longestCommonSubsequence.longestCommonSubsequence("abcde", "ace"));

    }

}