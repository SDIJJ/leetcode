package 滑动窗口;

/**
 * @Description: 3
 * @author: Arnold
 * @since: 2019/3/21 20:32
 * @version: v1.0.0
 */
public class 无重复字符的最长子串3 {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=-1;
        int size=0;
        int arr[] =new int[256];
        char[] chars = s.toCharArray();
        while (l < s.length()) {
            if(r+1<s.length()&&arr[chars[r+1]]==0)
                arr[chars[++r]]++;
            else
                arr[chars[l++]]--;

            size=Math.max(size,r-l+1);
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new 无重复字符的最长子串3().lengthOfLongestSubstring("abcabcbb"));
    }
}
