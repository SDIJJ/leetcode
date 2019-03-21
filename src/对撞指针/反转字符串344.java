package 对撞指针;

/**
 * @Description: 反转字符串
 * @author: Arnold
 * @since: 2019/3/21 17:52
 * @version: v1.0.0
 */
public class 反转字符串344 {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while (l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
}
