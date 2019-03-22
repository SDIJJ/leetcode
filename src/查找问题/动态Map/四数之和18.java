package 查找问题.动态Map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.*;

/**
 * @Description: 四数之和
 * @author: Arnold
 * @since: 2019/3/22 16:53
 * @version: v1.0.0
 */
public class 四数之和18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    if (nums[i] + nums[j] + nums[l] + nums[r] == 0){
                        set.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                    }
                    else if ((nums[i] + nums[j]) + (nums[l] + nums[r])<target)
                        l++;
                    else
                        r--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        new 四数之和18().fourSum(new int[]{1, 0, -1, 0, -2, 2},0).forEach(e->{
            System.out.println(e);
        });
    }
}
