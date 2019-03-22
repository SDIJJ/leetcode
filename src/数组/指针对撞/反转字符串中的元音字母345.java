package 数组.指针对撞;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 反转字符串中的元音字母
 * @author: Arnold
 * @since: 2019/3/21 17:57
 * @version: v1.0.0
 */
public class 反转字符串中的元音字母345 {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (!check1(arr[l])) {
                l++;
                continue;
            }
            if (!check1(arr[r])) {
                r--;
                continue;
            }
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
        return String.valueOf(arr);
    }

    private boolean check1(char s) {
        char[] y = {'a', 'e', 'o', 'u', 'A', 'E', 'O', 'U', 'i', 'I'};
        for (int i = 0; i < y.length; i++) {
            if (s == y[i])
                return true;

        }
        return false;
    }
}
