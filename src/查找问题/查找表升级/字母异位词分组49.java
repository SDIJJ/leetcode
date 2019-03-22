package 查找问题.查找表升级;

import java.util.*;

/**
 * @Description:字母异位词分组
 * @author: Arnold
 * @since: 2019/3/22 20:29
 * @version: v1.0.0
 */
public class 字母异位词分组49 {
    /**
     * 超级骚的代码.......................
     * @param strs
     * @return
     */
 /*   public List<List<String>> groupAnagrams(String[] strs) {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};//最多10609个z

        List<List<String>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String s : strs) {
            int key = 1;
            for (char c : s.toCharArray()) {
                key *= prime[c - 'a'];
            }
            List<String> t;
            if (map.containsKey(key)) {
                t = res.get(map.get(key));
            } else {
                t = new ArrayList<>();
                res.add(t);
                map.put(key, res.size() - 1);
            }
            t.add(s);
        }
        return res;
    }*/

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map=new HashMap<>();
        for (String s:strs) {
            char [] chars=s.toCharArray();
            Arrays.sort(chars);
            if(map.containsKey(String.valueOf(chars)))
                map.get(String.valueOf(chars)).add(s);
            else{

                map.put(String.valueOf(chars),new ArrayList());
                map.get(String.valueOf(chars)).add(s);
            }

        }
        return new ArrayList(map.values());
    }



    public static void main(String[] args) {
        System.out.println(new 字母异位词分组49().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
