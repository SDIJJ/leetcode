package 回溯和递归;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * @author: Arnold
 * @since: 2019/4/29 14:44
 * @version: v1.0.0
 */
public class 组合77 {
    private static List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || k > n) return list;
        find(n, k, 1, new ArrayList<Integer>());
        return list;
    }

    private static void find(int n, int k, int start, ArrayList<Integer> res) {
        if (k == res.size()) {
            list.add((List<Integer>) res.clone());
            return;
        }
        for (int i = start; i <= n; i++) {
            res.add(i);
            find(n, k, i + 1, res);
            res.remove(res.size() - 1);
        }
        return;
    }
}
