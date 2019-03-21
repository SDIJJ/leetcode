package 对撞指针;

/**
 * @Description: |__________|对撞指针
 * @author: Arnold
 * @since: 2019/3/21 17:30
 * @version: v1.0.0
 */
public class 两数之和two输入有序数组167 {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;

        while (l<r) {
            int sum=numbers[l]+numbers[r];
            if(sum==target)
                return new int []{l+1,r+1};
            else if(sum>target)
                r--;
            else
                l++;
        }
        return new int[2];
    }
}
