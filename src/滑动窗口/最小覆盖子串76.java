package 滑动窗口;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/3/21 21:20
 * @version: v1.0.0
 */
public class 最小覆盖子串76 {
    public String minWindow(String s, String t) {
        char[] tCount = new char[256];   //记录目标
        char[] sCount = new char[256];   //记录库
        for (char ch : t.toCharArray()) {
            tCount[ch]++;
        }
        int count = 0;
        int begin = 0;
        String res = "";
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i)]++;
            if (sCount[s.charAt(i)] <= tCount[s.charAt(i)]) {
                count++;
            }
            if (count == t.length()) {
                //sCount中超过tCount的字母，跳过并且sCount减一
                while (begin < i && sCount[s.charAt(begin)] > tCount[s.charAt(begin)]) {
                    sCount[s.charAt(begin)]--;
                    begin++;
                }
                //更新最小子串
                if (i - begin + 1 < len) {
                    len = i - begin + 1;
                    res = s.substring(begin, begin + len);
                }
                //左边指针右移
                sCount[s.charAt(begin)]--;
                begin++;
                count--;
            }
        }
        return res;
    }
}
