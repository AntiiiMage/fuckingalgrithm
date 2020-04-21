package xuz.play.algrithm.slidewindow;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by XuMac on Apr1820.
 */
public class TrappedWaterTest {

    private TrappedWater trappedWater = new TrappedWater();

    @Test
    public void testCalculation() {
        int[] blocks = {2, 1, 2};
        int result = trappedWater.calculate(blocks);
        Assert.assertEquals(1, result);


        blocks = new int[]{5, 1, 5};
        result = trappedWater.calculate(blocks);
        Assert.assertEquals(4, result);


        blocks = new int[]{5, 1, 5, 1, 2, 2, 2, 1, 2};
        result = trappedWater.calculate(blocks);
        Assert.assertEquals(6, result);


        blocks = new int[]{7, 6, 5, 4, 3, 2, 1};
        result = trappedWater.calculate(blocks);
        Assert.assertEquals(0, result);


        blocks = new int[]{10, 5, 5, 5, 3, 8, 10};
        result = trappedWater.calculate(blocks);
        Assert.assertEquals(24, result);


        blocks = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        result = trappedWater.calculate(blocks);
        Assert.assertEquals(6, result);


        blocks = new int[]{1, 4, 1, 1, 3, 2};
        result = trappedWater.calculate(blocks);
        Assert.assertEquals(4, result);
    }

}