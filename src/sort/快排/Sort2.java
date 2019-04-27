package sort.快排;

import sort.Util;

/**
 * @Description: 单路快排
 * @author: Arnold
 * @since: 2019/3/28 11:23
 * @version: v1.0.0
 */


public class Sort2 {
    public void quickSort(int arr[], int l, int r) {
        if (l >= r)
            return;
        int p = partition(arr, l, r);
        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private int partition(int arr[], int l, int r) {
        int index = arr[l];
        int k=l;
        for (int i = l+1; i <=r ; i++) {
            if(arr[i]<index)
                Util.swap(arr,i,++k);
        }
        Util.swap(arr,l,k);
        return k;
    }

    public static void main(String[] args) {
        int arr[] = Util.randomArr(50);
        new Sort2().quickSort(arr, 0, arr.length - 1);
        Util.print(arr);
    }
}

