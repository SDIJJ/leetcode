package 查找问题.动态Map;

import java.util.Arrays;

/**
 * @Description: 最接近的三数之和
 * @author: Arnold
 * @since: 2019/3/22 17:39
 * @version: v1.0.0
 */
public class 最接近的三数之和16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = target;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int temp = nums[i] + nums[l] + nums[r];
                if (max > Math.abs(target - temp)) {
                    sum = temp;
                    max = Math.abs(target - temp);
                }
                if (nums[i] + nums[l] + nums[r] == target)
                    return target;
                else {
                    if (l + 1 < r) {
                        if (nums[i] + nums[l] + nums[r] < target)
                            l++;
                        else
                            r--;

                    } else
                        break;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new 最接近的三数之和16().threeSumClosest(new int[]{1, 2, 5, 10, 11}, 12));
    }
}
