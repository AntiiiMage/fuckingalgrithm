package xuz.play.algrithm.dp;

/**
 * Created by XuMac on Apr1920.
 * <p>
 * https://leetcode.com/problems/decode-ways/solution/
 */
public class DecodeWays {

    public int numDecodings(String input) {

        if (Integer.valueOf(input) == 0) {
            return 0;
        }

        if (input.length() <= 1) {
            return 1;
        }

        int[] cache = new int[input.length()];
        if (input.substring(0, 1).equals("0")) {
            cache[0] = 0;
        } else {
            cache[0] = 1;
        }


        for (int i = 1; i < input.length(); i++) {
            String subString = input.substring(i - 1, i + 1);
            int value = Integer.valueOf(subString);
            int currenIndexValue = Integer.valueOf(subString.substring(1));
            int preIndexValue = Integer.valueOf(subString.substring(0, 1));

            if (cache[i - 1] == 0 || value == 0) {
                cache[i] = 0;
                continue;
            }

            if (currenIndexValue == 0) {
                cache[i] = cache[i - 1];
            } else if (value > 0 && value <= 26) {
                cache[i] = cache[i - 1] + 1;
            } else {
                cache[i] = cache[i - 1];
            }
        }

        return cache[input.length() - 1];

    }
}
