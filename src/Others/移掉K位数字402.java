package Others;

/**
 * @Description: 移掉K位数字--通过栈进行优化,时间复杂度O(n),空间复杂度O(n)
 * @author: Arnold
 * @since: 2019/3/29 12:24
 * @version: v1.0.0
 */
public class 移掉K位数字402 {
    public String removeKdigits(String num, int k) {
        int newStrLen = num.length() - k;
        char stack[] = new char[num.length()];
        int top = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (top > 0 && stack[top - 1] > c && k > 0) {
                top--;
                k--;
            }
            stack[top++] = c;
        }
        int l = 0;
        while (l < newStrLen && stack[l] == '0')
            l++;
        return l == newStrLen ? "0" : new String(stack, l, newStrLen - l);
    }
}
