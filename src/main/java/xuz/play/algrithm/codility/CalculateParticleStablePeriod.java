package xuz.play.algrithm.codility;

/**
 * Created by XuMac on Apr1820.
 */

/* https://leetcode.com/discuss/interview-question/428272/ */
public class CalculateParticleStablePeriod {

    // Find all max ordered subsequence from list, then calculate
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (null == A || A.length < 3) {
            return 0;
        }

        int ans = 0;
        int maxLength = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if (isStable(A, i) || isUpping(A, i) || isDowning(A, i)) {
                if (maxLength == 0) {
                    maxLength = 3;
                } else {
                    maxLength++;
                }
            } else {
                ans += caclulateSubSequence(maxLength);
                maxLength = 0;
            }
        }
        ans += caclulateSubSequence(maxLength);
        return ans;

    }

    private int caclulateSubSequence(int length) {
        int ans = 0;
        for (int i = length - 2; i > 0; i--) {
            ans += i;
        }
        return ans;
    }


    private boolean isStable(int[] a, int i) {
        return a[i - 1] == a[i] && a[i] == a[i + 1];
    }

    private boolean isDowning(int[] a, int i) {
        return a[i - 1] - a[i] == a[i] - a[i + 1] && a[i] - a[i + 1] > 0;
    }

    private boolean isUpping(int[] a, int i) {
        return a[i] - a[i - 1] == a[i + 1] - a[i] && a[i + 1] - a[i] > 0;
    }
}
