package 查找问题.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description: 单词模式
 * @author: Arnold
 * @since: 2019/3/22 15:31
 * @version: v1.0.0
 */
public class 单词模式290 {
    public boolean wordPattern(String pattern, String str) {
        char[] pp = pattern.toCharArray();
        String[] ss = str.split(" ");
        if (pp.length != ss.length)
            return false;
        Set<Character> set = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < pp.length; i++) {
            set.add(pp[i]);
            set1.add(ss[i]);
        }
        if (set.size() != set1.size())
            return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pp.length; i++) {
            if (!map.containsKey(pp[i]))
                map.put(pp[i], ss[i]);
            else {
                if (!map.get(pp[i]).equals(ss[i]))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new 单词模式290().wordPattern("abba", "dog dog dog dog"));
    }
}
