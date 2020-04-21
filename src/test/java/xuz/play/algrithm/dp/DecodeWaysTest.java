package xuz.play.algrithm.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by XuMac on Apr1920.
 */
public class DecodeWaysTest {
    @Test
    public void numDecodings() throws Exception {

        System.out.println("10".charAt(0));
        System.out.println("10".charAt(1) == 0);

        DecodeWays decodeWays = new DecodeWays();
        Assert.assertEquals(1, decodeWays.numDecodings("10"));
        Assert.assertEquals(3, decodeWays.numDecodings("226"));
        Assert.assertEquals(2, decodeWays.numDecodings("12"));
        Assert.assertEquals(0, decodeWays.numDecodings("100"));
        Assert.assertEquals(0, decodeWays.numDecodings("01"));
        Assert.assertEquals(0, decodeWays.numDecodings("011"));
        Assert.assertEquals(2, decodeWays.numDecodings("101"));

    }

}