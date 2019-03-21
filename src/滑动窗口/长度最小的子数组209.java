package 滑动窗口;

/**
 * @Description:长度最小的子数组
 * @author: Arnold
 * @since: 2019/3/21 19:43
 * @version: v1.0.0
 */
public class 长度最小的子数组209 {
    public int minSubArrayLen(int s, int[] nums) {
        int l=0;
        int r=-1;
        int size=nums.length+1;
        int sum=0;
        while(l<nums.length){
            if(r+1<nums.length&&sum<s)
                sum+=nums[++r];
            else
                sum-=nums[l++];
            if(sum>=s)
            size=Math.min(size,(r-l+1));
        }
        return size==nums.length+1?0:size;
    }

    public static void main(String[] args) {
        System.out.println(new 长度最小的子数组209().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}
