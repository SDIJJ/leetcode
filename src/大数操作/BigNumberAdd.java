package 大数操作;

/**
 * @Description: 大数加法
 * @author: Arnold
 * @since: 2019/3/29 13:34
 * @version: v1.0.0
 */
public class BigNumberAdd {
    public static String add(String str1, String str2) {
        String result = "";
        int len = str1.length() > str2.length() ? str1.length() : str2.length();
        int arr1[] = new int[len + 1];
        int arr2[] = new int[len + 1];
        for (int i = 0; i < str1.length(); i++)
            arr1[i] = str1.charAt(str1.length() - i - 1) - '0';
        for (int i = 0; i < str2.length(); i++)
            arr2[i] = str2.charAt(str2.length() - i - 1) - '0';
        for (int i = 0; i <= len; i++) {
            arr1[i] += arr2[i];
            if (arr1[i] >= 10) {
                arr1[i + 1]++;
                arr1[i] -= 10;
            }
        }

        for (int i = 0; i < len; i++)
            result = arr1[i] + result;
        if (arr1[len] != 0)
            result = arr1[len] + result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(BigNumberAdd.add("91111911111111111111111119", "91111911111111111111111119"));
    }
}
