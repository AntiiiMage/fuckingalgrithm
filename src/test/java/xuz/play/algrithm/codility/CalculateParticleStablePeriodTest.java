package xuz.play.algrithm.codility;

import org.junit.Assert;
import org.junit.Test;
import xuz.play.algrithm.codility.CalculateParticleStablePeriod;

/**
 * Created by XuMac on Apr1820.
 */
public class CalculateParticleStablePeriodTest {

    private CalculateParticleStablePeriod calculateParticleStablePeriod = new CalculateParticleStablePeriod();

    @Test
    public void solution() throws Exception {

        int[] blocks;
        int solution;

        blocks = new int[]{-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
        solution = calculateParticleStablePeriod.solution(blocks);
        Assert.assertEquals(5, solution);

        blocks = new int[]{1, 1, 1, 1, 9, 2};
        solution = calculateParticleStablePeriod.solution(blocks);
        Assert.assertEquals(3, solution);

        blocks = new int[]{1, 1, 1, 1, 1, 1};
        solution = calculateParticleStablePeriod.solution(blocks);
        Assert.assertEquals(10, solution);

        blocks = new int[]{1, 1, 1, 1};
        solution = calculateParticleStablePeriod.solution(blocks);
        Assert.assertEquals(3, solution);

        blocks = new int[]{1, 10, 1, 1};
        solution = calculateParticleStablePeriod.solution(blocks);
        Assert.assertEquals(0, solution);

        blocks = new int[]{1, 3, 5, 7, 8, 8, 8, 7, 5, 3, 1};
        solution = calculateParticleStablePeriod.solution(blocks);
        Assert.assertEquals(7, solution);


    }

}