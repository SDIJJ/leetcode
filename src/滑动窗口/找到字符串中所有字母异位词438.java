package 滑动窗口;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;

/**
 * @Description:找到字符串中所有字母异位词
 * @author: Arnold
 * @since: 2019/3/21 20:04
 * @version: v1.0.0
 */
public class 找到字符串中所有字母异位词438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList();
        if (p.length() > s.length())
            return list;
        int l = 0;
        int r = p.length() - 1;

        while (r < s.length()) {
            String temp = s.substring(l, r + 1);
            if (compare(temp,p)) {
                list.add(l);
            }
            l++;
            r++;

        }
        return list;

    }

    private boolean compare(String s, String p) {
        int arr[] = new int[256];
        char[] ss = s.toCharArray();
        char[] pp = p.toCharArray();
        for (int i = 0; i <ss.length ; i++)
            arr[ss[i]]++;
        for (int i = 0; i <pp.length ; i++)
            arr[pp[i]]--;
        for (int i = 0; i <arr.length ; i++)
            if(arr[i]!=0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        new 找到字符串中所有字母异位词438().findAnagrams("cbaebabacd","abc").forEach(System.out::println);
    }

}
