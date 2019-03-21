package 数组.原地操作数组;

/**
 * @Description: 删除排序数组中的重复项
 * @author: Arnold
 * @since: 2019/3/21 11:29
 * @version: v1.0.0
 */
public class 删除排序数组中的重复项26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int temp=nums[0];
        int k=1;
        for (int i = 1; i < nums.length; i++) {
            if(temp!=nums[i]){
                nums[k++]=nums[i];
                temp=nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(new 删除排序数组中的重复项26().removeDuplicates(new int[]{1, 1, 2}));
    }
}
