package sort.插入;

import java.util.Arrays;

/**
 * @Description: 寻找元素的合适的插入位置
 * @author: Arnold
 * @since: 2019/4/6 8:41
 * @version: v1.0.0
 */
public class Sort1 {
    public static void insertSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && (arr[j] < arr[j - 1]); j--) {//可以根据条件提前终止
                swap(arr,j,j-1);
            }
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr []=new int[]{1,3,4,2,5,6,1,7,2};
        Sort1.insertSort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }
}
