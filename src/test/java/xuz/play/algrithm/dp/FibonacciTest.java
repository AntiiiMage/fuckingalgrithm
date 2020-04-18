package xuz.play.algrithm.dp;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by XuMac on Apr1820.
 */
public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();


    @Test
    public void bottleUp() throws Exception {

        int i = 4;
        int result1 = fibonacci.bottleUp(i);
        int result2 = fibonacci.topDown(i);
        System.out.println("index=" + i + ", bottleUp=" + result1 + ", topupDown=" + result2);
        Assert.assertEquals(result1, result2);

    }

}