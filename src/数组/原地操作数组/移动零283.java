package 数组.原地操作数组;

import java.util.Arrays;

/**
 * @Description: 原地移动数组(将第i个顺序的数放在第i个位置)
 * @author: Arnold
 * @since: 2019/3/21 10:47
 * @version: v1.0.0
 */
public class 移动零283 {
    public void moveZeroes(int[] nums) {
        int k=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                if(k!=i)
                    swap(nums,i,k++);
                else
                    k++;
            }
        }
    }

    private void swap(int [] arr,int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }

    public static void main(String[] args) {
        int arr[]={1,2,0,9,0,8};
        new 移动零283().moveZeroes(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
