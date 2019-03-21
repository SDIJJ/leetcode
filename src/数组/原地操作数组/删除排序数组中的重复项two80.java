package 数组.原地操作数组;

/**
 * @Description: 删除排序数组中的重复项 II
 * @author: Arnold
 * @since: 2019/3/21 12:19
 * @version: v1.0.0
 */
public class 删除排序数组中的重复项two80 {
    public int removeDuplicates(int[] nums) {
        int k=0;
        final int temp=-100000000;
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i]==nums[i+1]&&nums[i]==nums[i+2])
                nums[i]=temp;
        }
        for (int i = 0; i <nums.length ; i++)
            if(nums[i]!=temp)
                nums[k++] = nums[i];
        return k;
    }

    public static void main(String[] args) {
        System.out.println(new 删除排序数组中的重复项two80().removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
}
