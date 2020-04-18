package xuz.play.algrithm.codility;

import org.junit.Assert;
import org.junit.Test;
import xuz.play.algrithm.codility.LongestDistanceOfFrog;

/**
 * Created by XuMac on Apr1720.
 */
public class LongestDistanceOfFrogTest {

    private LongestDistanceOfFrog longestDistanceOfFrog = new LongestDistanceOfFrog();

    @Test
    public void testMethod1(){

        int[] blocks = new int[]{1, 2, 5, 10, 8};
        int ans = longestDistanceOfFrog.resolveDistance1(blocks);
        Assert.assertEquals(4, ans);

        blocks = new int[]{1, 2, 5, 10, 10, 8};
        ans = longestDistanceOfFrog.resolveDistance1(blocks);
        Assert.assertEquals(5, ans);

        blocks = new int[]{4, 3, 2, 1, 2, 3};
        ans = longestDistanceOfFrog.resolveDistance2(blocks);
        Assert.assertEquals(6, ans);

        blocks = new int[]{1, 1, 1};
        ans = longestDistanceOfFrog.resolveDistance1(blocks);
        Assert.assertEquals(3, ans);

        blocks = new int[]{1};
        ans = longestDistanceOfFrog.resolveDistance1(blocks);
        Assert.assertEquals(1, ans);
    }

}
