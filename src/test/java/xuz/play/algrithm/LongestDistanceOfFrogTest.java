package xuz.play.algrithm;

import org.junit.Assert;
import org.junit.Test;

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

        blocks = new int[]{1, 1, 1};
        ans = longestDistanceOfFrog.resolveDistance1(blocks);
        Assert.assertEquals(3, ans);

        blocks = new int[]{1};
        ans = longestDistanceOfFrog.resolveDistance1(blocks);
        Assert.assertEquals(0, ans);
    }

}
