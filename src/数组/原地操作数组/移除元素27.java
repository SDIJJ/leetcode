package 数组.原地操作数组;

/**
 * @Description: 移除元素
 * @author: Arnold
 * @since: 2019/3/21 11:04
 * @version: v1.0.0
 */
public class 移除元素27 {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val)
                nums[k++]=nums[i];
        }
        return k;
    }

    public static void main(String[] args) {
        System.out.println(new 移除元素27().removeElement(new int[]{3, 2, 2, 3}, 2));
    }
}
