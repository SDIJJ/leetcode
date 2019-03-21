package 对撞指针;

/**
 * @Description: 验证回文串
 * @author: Arnold
 * @since: 2019/3/21 17:37
 * @version: v1.0.0
 */
public class 验证回文串125 {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l=0,r=chars.length-1;
       while(l<r){
           if(!Character.isLetterOrDigit(chars[l])||chars[l]==' '){
               l++;
               continue;
           }
           if(!Character.isLetterOrDigit(chars[r])||chars[r]==' '){
               r--;
               continue;
           }
           if(Character.toLowerCase(chars[l])==Character.toLowerCase(chars[r])){
               r--;
               l++;
           }else{
               return false;
           }
       }
       return true;
    }
}
