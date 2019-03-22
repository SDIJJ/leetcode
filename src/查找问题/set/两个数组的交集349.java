package 查找问题.set;

import java.util.*;

/**
 * @Description: 两个数组的交集
 * @author: Arnold
 * @since: 2019/3/22 10:22
 * @version: v1.0.0
 */
public class 两个数组的交集349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int k = 0;
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums1.length; i++)
            set.add(nums1[i]);
        for (int i = 0; i < nums2.length; i++)
            if (set.contains(nums2[i])) {
                nums1[k++] = nums2[i];
                set.remove(nums2[i]);
            }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
