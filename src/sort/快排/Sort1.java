package sort.快排;


import sort.Util;

/**
 * @Description: 双路快拍，基于交换索引实现
 * @author: Arnold
 * @since: 2019/3/28 10:53
 * @version: v1.0.0
 */
public class Sort1 {
    public void quickSort(int arr[], int l, int r) {
        if (l >= r)
            return;
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private int partition(int arr[], int l, int r) {
        int index = arr[l];
        int left = l;
        int right = r;
        while (left != right) {
            while (left < right && arr[right] > index)
                right--;
            while ((left < right && arr[left] <= index))
                left++;
            if (left < right)
                Util.swap(arr, left, right);
        }
        Util.swap(arr, l, left);
        return left;
    }

    public static void main(String[] args) {
        int arr[] = Util.randomArr(50);
        new Sort1().quickSort(arr, 0, arr.length - 1);
        Util.print(arr);
    }
}
