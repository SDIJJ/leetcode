package 查找问题.set;

/**
 * @Description:有效的字母异位词
 * @author: Arnold
 * @since: 2019/3/22 10:44
 * @version: v1.0.0
 */
public class 有效的字母异位词242 {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i)]--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new 有效的字母异位词242().isAnagram("anagram", "nagaram"));
    }
}
