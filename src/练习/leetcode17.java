package 练习;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/5/5 7:18
 * @version: v1.0.0
 */
public class leetcode17 {
    static List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        list.clear();
        if(digits==null||digits=="")
            return list;
        find(digits, 0, "");
        return list;
    }

    private static void find(final String str, int level, String res) {
        final String[] arr = {"", "", "abc", "def", "hgi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (str.length() == level) {
            list.add(res);
            return;
        }
        String s = arr[str.charAt(level) - '0'];
        for (int i = 0; i < s.length(); i++) {
            find(str, level + 1, res + s.charAt(i));
        }
    }
}
