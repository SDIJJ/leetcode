package 查找问题.set;

import java.util.*;

/**
 * @Description: 根据字符出现频率排序
 * @author: Arnold
 * @since: 2019/3/22 11:07
 * @version: v1.0.0
 */
public class 根据字符出现频率排序415 {
    public String frequencySort(String s) {
        char ch1[] = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(ch1[i]))
                map.put(ch1[i], (int) map.get(ch1[i]) + 1);
            else
                map.put(ch1[i], 1);

        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).getValue(); j++) {
                sb.append(list.get(i).getKey());

            }

        }
        return sb.toString();
    }
}
