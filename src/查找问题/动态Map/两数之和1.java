package 查找问题.动态Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:两数之和
 * @author: Arnold
 * @since: 2019/3/22 16:13
 * @version: v1.0.0
 */
public class 两数之和1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];
            if (map.containsKey(find))
                return new int[]{map.get(find), i};
            else
                map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Arrays.stream(new 两数之和1().twoSum(new int[]{2, 7, 11, 15}, 9)).forEach(System.out::println);
    }
}
