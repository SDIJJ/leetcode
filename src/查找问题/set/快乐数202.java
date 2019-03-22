package 查找问题.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 快乐数
 * @author: Arnold
 * @since: 2019/3/22 11:23
 * @version: v1.0.0
 */
public class 快乐数202 {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();

        while(true){
            if(n==1)
                return true;
            if(set.contains(n))
                return false;
            else {
                set.add(n);
                n=sum(n);
            }
        }

    }
    private int sum(int n){
        int sum=0;
        while (n > 0) {
            sum+=(n%10)*(n%10);
            n=n/10;
        }
        return sum;
    }
}
