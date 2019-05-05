package 回溯和递归;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * @author: Arnold
 * @since: 2019/4/29 8:08
 * @version: v1.0.0
 */
public class 电话号码组合17 {
    private static List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        list.clear();
        if (digits == null || digits.equals(""))
            return list;
        find(digits, 0, "");
        return list;
    }

    private static void find(String s, int index, String result) {
        if (index == s.length()) {
            list.add(result);
            return;
        }

        String[] strs = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String temp = strs[s.charAt(index) - '0'];
        for (int i = 0; i < temp.length(); i++)
            find(s, index + 1, result + temp.charAt(i));
    }
}
