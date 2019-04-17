package sort.插入;

import java.util.Arrays;

/**
 * @Description: 优化后的插入排序, 将多次交换改成赋值
 * @author: Arnold
 * @since: 2019/4/6 8:56
 * @version: v1.0.0
 */
public class Sort2 {
    public static void insertSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            //寻找元素arr[i]合适的插入位置
            int e = arr[i];
            int j; //j保存e应该插入的位置
            for (j = i; j > 0 && (arr[j - 1] > e); j--)
                arr[j] = arr[j - 1];
            arr[j] = e;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 4, 2, 5, 6, 1, 7, 2};
        Sort2.insertSort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }
}
