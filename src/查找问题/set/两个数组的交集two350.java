package 查找问题.set;

import java.util.*;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/3/22 15:59
 * @version: v1.0.0
 */
public class 两个数组的交集two350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i]) + 1);
            else
                map.put(nums1[i], 1);
        }

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int arr[] = new int[list.size()];
        int i = 0;
        for (int i1 = 0; i1 < list.size(); i1++)
            arr[i++] = list.get(i1);
        return arr;
    }

    public static void main(String[] args) {
       int [] nums1 = {1,2,2,1}, nums2 = {2,2};
        Arrays.stream(new 两个数组的交集two350().intersect(nums1, nums2)).forEach(System.out::println);
    }
}
