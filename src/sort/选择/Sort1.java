package sort.选择;

/**
 * @Description: 选择第n小的元素, 放在n的位置
 * @author: Arnold
 * @since: 2019/4/6 8:29
 * @version: v1.0.0
 */
public class Sort1 {

    public static void select(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
