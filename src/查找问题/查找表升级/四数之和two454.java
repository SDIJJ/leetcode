package 查找问题.查找表升级;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 四数之和two454
 * @author: Arnold
 * @since: 2019/3/22 20:17
 * @version: v1.0.0
 */
public class 四数之和two454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (map.containsKey(A[i] + B[j]))
                    map.put((A[i] + B[j]), map.get(A[i] + B[j]) + 1);
                else
                    map.put((A[i] + B[j]), 1);
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                int sum = -(C[i] + D[j]);
                if (map.containsKey(sum) && map.get(sum) > 0)
                    count += map.get(sum);
            }
        }
        return count;
    }
}
