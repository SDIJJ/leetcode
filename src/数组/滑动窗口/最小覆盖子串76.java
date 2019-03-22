package 数组.滑动窗口;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/3/21 21:20
 * @version: v1.0.0
 */
public class 最小覆盖子串76 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int tArr[] = new int[256];
        int sArr[] = new int[256];
        for (int i = 0; i < tt.length; i++)
            tArr[tt[i]]++;

        int l = 0;
        int r = -1;
        String str = "";
        int size = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i <110111 ; i++) {    //待优化..............
            if (count == t.length()) {
                if (size > (r - l+1 )) {
                    size = r - l+1 ;
                    str = s.substring(l, r + 1);
                }
                sArr[ss[l]]--;
                if (sArr[ss[l]] < tArr[ss[l]]) {
                    count--;
                }
                l++;
            } else {
                if(r+1<ss.length){
                    sArr[ss[++r]]++;
                    if (sArr[ss[r]] <= tArr[ss[r]])
                        count++;
                }

            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new 最小覆盖子串76().minWindow("ADOBECODEBANC", "ABC"));
    }
}
