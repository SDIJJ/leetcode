package 数组.归并思想;

import java.util.*;

/**
 * @Description: 合并两个有序数组
 * @author: Arnold
 * @since: 2019/3/22 9:45
 * @version: v1.0.0
 */
public class 合并两个有序数组88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList();
        for (int k = 0; k <m+n ; k++)  {
            if (j > n - 1) {
                list.add(nums1[i++]);
                continue;
            }
            if (i > m - 1) {
                list.add(nums2[j++]);
                continue;
            }
            if (nums1[i] <= nums2[j])
                list.add(nums1[i++]);
            else
                list.add(nums2[j++]);
        }
        for (int k = 0; k < list.size(); k++) {
            nums1[k] = list.get(k);
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0}, m = 3;
        int nums2[] = {2, 5, 6}, n = 3;
        new 合并两个有序数组88().merge(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::println);
    }
}
