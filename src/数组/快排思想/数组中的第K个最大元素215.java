package 数组.快排思想;

/**
 * @Description: 数组中的第K个最大元素
 * @author: Arnold
 * @since: 2019/3/21 16:58
 * @version: v1.0.0
 */
public class 数组中的第K个最大元素215 {
    public int findKthLargest(int[] nums, int k) {
        int l = 0;
        int r = nums.length - 1;
        int p = partion(nums, l, r);
        int find = nums.length - k;
        while (p != find) {
            if (p < find)
                p = partion(nums, p + 1, r);
            else
                p = partion(nums, l, p - 1);
        }
        return nums[p];
    }

    public int partion(int[] arr, int l, int r) {
        int temp = arr[l];
        int j = l;
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < temp)
                swap(arr, ++j, i);
        }
        swap(arr, l, j);
        return j;
    }

    private void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(new 数组中的第K个最大元素215().findKthLargest(new int[]{3, 1, 2, 4}, 2));
    }
}
