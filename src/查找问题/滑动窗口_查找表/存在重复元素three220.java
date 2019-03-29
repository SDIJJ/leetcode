package 查找问题.滑动窗口_查找表;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Description: 存在重复元素 III
 * @author: Arnold
 * @since: 2019/3/23 10:40
 * @version: v1.0.0
 */
public class 存在重复元素three220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.ceiling((long)nums[i]-(long)t)!=null&&set.ceiling((long)nums[i]-(long)t)<=(long)nums[i]+(long)t)
                return true;


            set.add((long) nums[i]);
            if (set.size() > k)
                set.remove((long)nums[i - k]);
        }
        return false;
    }
}
