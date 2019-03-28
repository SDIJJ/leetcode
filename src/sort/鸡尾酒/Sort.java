package sort.鸡尾酒;

import com.jia.test.sort.Util;

/**
 * @Description: 鸡尾酒排序最终版
 * @author: Arnold
 * @since: 2019/3/28 8:50
 * @version: v1.0.0
 */
public class Sort {
    public void sort(int arr []){
        boolean isSort=true;//标记已经有序
        int rightExchangIndex=arr.length;
        int leftExchangeIndex=0;
        int sortRight=arr.length-1;
        int sortLeft=0;
        for (int i = 0; i <arr.length/2; i++) {
            for (int j = 0; j <sortRight ; j++) {
                if(arr[j]>arr[j+1]){
                    Util.swap(arr,j,j+1);
                    isSort=false;
                    rightExchangIndex=j;
                }
            }
            if(isSort==true)
                break;
            sortRight=rightExchangIndex;

            for (int j =arr.length - i-1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    Util.swap(arr,j,j-1);
                    isSort=false;
                    leftExchangeIndex=j;
                }
            }
            if(isSort==true)
                break;;
                sortLeft=leftExchangeIndex;
        }
    }

    public static void main(String[] args) {
        int arr[]=Util.randomArr(100);
        new Sort().sort(arr);
        Util.print(arr);
    }
}
