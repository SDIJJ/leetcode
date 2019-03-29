package 查找问题.滑动窗口_查找表;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 存在重复元素 II
 * @author: Arnold
 * @since: 2019/3/23 10:22
 * @version: v1.0.0
 */
public class 存在重复元素two219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
            if(set.size()>k)
                set.remove(nums[i-k]);
            
        }
        return false;
    }
}
