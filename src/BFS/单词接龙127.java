package BFS;

import javafx.util.Pair;

import java.util.*;

/**
 * @Description: 单词接龙
 * @author: Arnold
 * @since: 2019/4/19 9:09
 * @version: v1.0.0
 */
public class 单词接龙127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair<String, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(beginWord, 0));
        while (!queue.isEmpty()) {
            Pair<String, Integer> pair = queue.poll();
            String string = pair.getKey();
            int step = pair.getValue();
            if (string.equals(endWord))
                return step;
            else {
                for (int i = 0; i < wordList.size(); i++) {
                    String s = wordList.get(i);
                    if (check(string, s)) {
                        if (endWord.equals(s))
                            return step + 1;
                        queue.add(new Pair<>(s, step + 1));
                    }
                }
            }
        }
        return 0;
    }

    private static boolean check(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        char[] chars = str1.toCharArray();
        char[] chars1 = str2.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars1[i])
                count++;
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        String[] arr = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> strings = Arrays.asList(arr);
        System.out.println(new 单词接龙127().ladderLength("hit", "cog", strings));
    }
}
