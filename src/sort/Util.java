package sort;

import java.util.Arrays;

/**
 * @Description: 排序工具类
 * @author: Arnold
 * @since: 2019/3/28 8:14
 * @version: v1.0.0
 */
public class Util {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] randomArr(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * 100);
        return arr;
    }

    public static void print(int arr[]) {
        Arrays.stream(arr).forEach(e->{
            System.out.print(e+" ");
        });
    }

}
