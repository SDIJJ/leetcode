package 数组.快排思想;

import java.util.Arrays;

/**
 * @Description: 颜色分类75(s三路快排思想)
 * @author: Arnold
 * @since: 2019/3/21 12:54
 * @version: v1.0.0
 */
public class 颜色分类75 {
    public void sortColors(int[] nums) {
        int l = -1, r = nums.length;
        for (int i = 0; i < r; ) {
            if (nums[i] == 1)
                i++;
            else if (nums[i] == 2) {
                swap(nums, i, --r);
            } else {
                swap(nums, i, ++l);
                i++;
            }
        }
    }

    private void swap(int[] arr, int num1, int num2) {
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0};
        new 颜色分类75().sortColors(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
