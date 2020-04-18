package xuz.play.algrithm.dp;

/**
 * Created by XuMac on Apr1820.
 */
public class Fibonacci {


    public int bottleUp(int N) {
        if (N <= 1) {
            return N;
        }

        if (N == 2) {
            return 1;
        }

        int current = 0;
        int pre1 = 1;
        int pre2 = 1;

        for (int i = 3; i <= N; i++) {
            current = pre1 + pre2;
            pre2 = pre1;
            pre1 = current;
        }

        return current;

    }

    public int topDown(int N){
        if (N <= 1) {
            return N;
        }

        int[] cache = new int[N+1];

        return helper(cache, N);
    }

    private int helper(int[] cache, int n) {
        if (n <= 1) {
            return n;
        }

        if(cache[n] > 0){
            return n;
        }

        int a = helper(cache, n-1);
        int b = helper(cache, n-2);

        cache[n] = a + b;
        return cache[n];
    }

}
