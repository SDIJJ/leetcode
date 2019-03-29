package 查找问题.查找表升级;


import java.util.*;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/3/23 9:14
 * @version: v1.0.0
 */
public class 回旋镖的数量44 {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        for (int i = 0; i < points.length; i++) {
            Map<Integer, Integer> map = new HashMap();
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int dis = dis(points[i], points[j]);
                    if (map.containsKey(dis))
                        map.put(dis, map.get(dis) + 1);
                    else
                        map.put(dis, 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet())
                    count += entry.getValue() * (entry.getValue() - 1);
        }
        return count;
    }

    private int dis(int[] m, int[] n) {
        return (m[0] - n[0]) * (m[0] - n[0]) + (m[1] - n[1]) * (m[1] - n[1]);
    }
}
