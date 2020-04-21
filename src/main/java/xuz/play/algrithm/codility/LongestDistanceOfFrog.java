package xuz.play.algrithm.codility;

/**
 * Created by XuMac on Apr1720.
 */

// There are N blocks, numberred from 0 to N-1 , arranged in a row , A couple of frogs were sitting
// together on one block when they had a terrible quarrel. Now they want to jump away from one another so
// that the distance between them will be as large as possible. The distance between blocks numbberd J
// and K, where J<=k, is cmputed as K-J+1, The frog can only jump up, meaning that they can move from
// one block to another only if two blocks are adjaccent and the second block is of the same or greater
// height as the first What is the longest distance that thay can possibly create between each other, if
// they also chose to sit on the optimal startging block initially?

//    You need to find the longest decreasing then increasing subseqence (using consecutive terms) in the sequence

/*  Example 1:
    given blocks = [2,6,8,5] -> return 3,
    if starting from blocks[0], the first frog can stay where it is and the second frog can jump to blocks[2](but not blocks[3])

    Example 2:
    blocks = [1,5,5,2,6], return 4;
    if starting from blocks[3] the first frog can jump to blocks[1], but not blocks[0] and the second frog can jump to blocks[4]

    Example 3:
    Blocks[1,1] return 2
    If starting from blocks[1] , the first frog can jump to blocks[0] and the second frog cn stay where it it, Starting from blocks[0] would result in the same distance.
*/

/* https://leetcode.com/discuss/interview-question/530658/Longest-distance-problem */

public class LongestDistanceOfFrog {


    public int resolveDistance2(int[] blocks) {
        int n = blocks.length;
        if (n < 2) return n;

        // to find the maximum length of the subsequence that first down(stable) then up(stable)
        int ans = 1;
        int maxDistance = 1;
        int downDistance = 1;
        for (int i = 1; i < n; i++) {

            if (blocks[i] >= blocks[i - 1]) {
                maxDistance++;
            }
            ans = max(ans, maxDistance);

            if (blocks[i] > blocks[i - 1]) {
                // reset down distance as 1
                downDistance = 1;
            } else {
                // downing or stable
                downDistance++;

                // downing, reset the maxdistance
                if (blocks[i] < blocks[i - 1]) {
                    maxDistance = downDistance;
                }
            }
            ans = max(ans, downDistance);
        }
        return ans;
    }

    public int resolveDistance1(int[] blocks) {
        // leftMaxArray[i] means the left maximum upping/stable length from blocks[i]
        int[] leftMaxArray = new int[blocks.length];

        // rightMaxArray[i] means the right maximum upping/stable length from blocks[i]
        int[] rightMaxArray = new int[blocks.length];


        // caculate the rightMaxArray
        int left = 0;
        int rightMax = 0;
        while (left < blocks.length) {
            if (left < blocks.length - 1 && blocks[left] <= blocks[left + 1]) {
                rightMax++;
            } else {
                updateRightMaxArray(rightMaxArray, left, rightMax);
                rightMax = 0;
            }
            left++;

        }

        // caculate the leftMaxArray
        int right = blocks.length - 1;
        int leftMax = 0;
        while (right >= 0) {
            if (right > 0 && blocks[right - 1] >= blocks[right]) {
                leftMax++;
            } else {
                updateLeftMaxArray(leftMaxArray, right, leftMax);
                leftMax = 0;
            }
            right--;

        }

        // calculate the max from index 0 to n
        int result = 0;
        for (int i = 0; i < blocks.length; i++) {
            result = max(result, leftMaxArray[i] + rightMaxArray[i]);
        }

        return result + 1;

    }


    private void updateRightMaxArray(int[] rightMaxArray, int left, int rightMax) {
        while (rightMax > 0) {
            rightMaxArray[left - rightMax] = rightMax--;
        }
    }


    private void updateLeftMaxArray(int[] leftMaxArray, int right, int leftMax) {
        while (leftMax > 0) {
            leftMaxArray[right + leftMax] = leftMax--;
        }
    }

    private int max(int value1, int value2) {
        return value1 >= value2 ? value1 : value2;
    }


}
