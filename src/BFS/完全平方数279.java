package BFS;

import javafx.util.Pair;

import java.util.*;

/**
 * @Description: 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 * @author: Arnold
 * @since: 2019/4/18 20:23
 * @version: v1.0.0
 */
public class 完全平方数279 {
    public int numSquares(int n) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(n, 0));
        boolean[] visited = new boolean[n + 1];
        Arrays.fill(visited, false);
        visited[n] = true;
        while (!queue.isEmpty()) {
            Pair<Integer, Integer> pair = queue.poll();
            int num = pair.getKey();
            int step = pair.getValue();
            if (num == 0)
                return step;
            for (int i = 1; num - i * i >= 0; i++) {
                if (visited[num - i * i] == false) {
                    queue.add(new Pair<>(num - i * i, step + 1));
                    visited[num - i * i] = true;
                }
            }
        }

      throw new RuntimeException("ERROR");
    }
}

