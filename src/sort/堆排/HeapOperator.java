package sort.堆排;

import sort.Util;

import java.util.Arrays;

/**
 * @Description: 构建堆
 * @author: Arnold
 * @since: 2019/3/29 7:31
 * @version: v1.0.0
 */
public class HeapOperator {
    /**
     * @param
     * @throws
     * @Description: 堆的上浮操作
     * @retrun ${return}
     * @author Arnold
     * @version v1.0.0
     * @date ${DATE}
     */
    public static void shiftUp(int arr[]) {
        int temp = arr[arr.length - 1];
        int child = arr.length - 1;
        int parent = (child - 1) / 2;
        while (parent > 0 && arr[parent] > arr[child]) {
            arr[child] = arr[parent];
            child = parent;
            parent = (parent - 1) / 2;
        }
        arr[parent] = temp;
    }

    /**
     * @param
     * @throws
     * @Description: 堆的下沉操作
     * @retrun ${return}
     * @author Arnold
     * @version v1.0.0
     * @date ${DATE}
     */
    public static void shiftDown(int arr[], int parentIndex, int length) {
        int temp = arr[parentIndex];
        int childIndex = 2 * parentIndex + 1;
        while (childIndex <= length) {
            //右孩子存在,且比左孩子小
            if (childIndex + 1 <= length && arr[childIndex] > arr[childIndex + 1])
                childIndex++;

            //父亲节点小于任意一个孩子,表示堆已经建立,可以跳出循环了
            if (temp <= arr[childIndex])
                break;

            arr[parentIndex] = arr[childIndex];
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
        arr[parentIndex] = temp;
    }

    /**
     * @param
     * @throws
     * @Description: 初始化堆
     * @retrun ${return}
     * @author Arnold
     * @version v1.0.0
     * @date ${DATE}
     */
    public static void initDeap(int arr[]) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            shiftDown(arr, i, arr.length - 1);
        }
    }

    /**
     * 堆排序
     *
     * @param arr
     */
    public static void heapSort(int arr[]) {
        //1.把无序数组构建成二叉堆
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            shiftDown(arr, i, arr.length-1);
        }
        System.out.println(Arrays.toString(arr));
        //2.循环删除堆顶的元素，移动到集合尾部，调节堆产生新的堆顶
        for (int i = arr.length - 1; i > 0; i--) {
            //最后一个元素和第一个元素交换
           Util.swap(arr,0,i);
            //下沉最大堆
            shiftDown(arr, 0, i-1);

        }
    }

    public static void main(String[] args) {
        int arr[] = Util.randomArr(20);
        heapSort(arr);
        Arrays.stream(arr).forEach(e -> {


            System.out.print(e + " ");
        });
    }
}
