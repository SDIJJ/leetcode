package 对撞指针;

/**
 * @Description: 盛最多水的容器
 * @author: Arnold
 * @since: 2019/3/21 18:05
 * @version: v1.0.0
 */
public class 盛最多水的容器11 {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r){
            int temp=Math.min(height[l],height[r])*(r-l);
            max=temp>max?temp:max;
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}
