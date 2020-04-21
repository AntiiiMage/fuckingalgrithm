package xuz.play.algrithm.slidewindow;

/**
 * Created by XuMac on Apr1820.
 */
public class TrappedWater {

    public int calculate(int[] blocks) {
        int left = 0;
        int right = blocks.length - 1;

        int ans = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {

            // 谁小计算谁
            if (blocks[left] <= blocks[right]) {
                // 更新当前左边最大值
                leftMax = Math.max(leftMax, blocks[left]);
                // 取左边最大值和右边当前值最小值
                ans += leftMax - blocks[left];
                left++;
            }

            if (blocks[right] < blocks[left]) {
                rightMax = Math.max(rightMax, blocks[right]);
                ans += rightMax - blocks[right];
                right--;
            }
        }
        return ans;
    }

}
