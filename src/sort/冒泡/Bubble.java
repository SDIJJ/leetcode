package sort.冒泡;


import sort.Util;

/**
 * @Description: 冒泡排序最终版
 * @author: Arnold
 * @since: 2019/3/28 8:11
 * @version: v1.0.0
 */
public class Bubble {
    public void sort(int arr[]) {
        boolean isSort = true;//处理是有已经排玩，优化时间
        int lastExchangeIndex = 0;
        int sortLast = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < sortLast; j++) {
                if (arr[j] > arr[j + 1]) {
                    Util.swap(arr, j, j + 1);
                    isSort = false;
                    lastExchangeIndex = j;
                }
            }
            if (isSort == true)
                break;
            sortLast = lastExchangeIndex;
        }
    }

    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        int arr[] = Util.randomArr(100);
        bubble.sort(arr);
        Util.print(arr);
    }
}
