package 队列.优先队列;

import javafx.util.Pair;

import java.util.*;

/**
 * @Description: 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * @author: Arnold
 * @since: 2019/4/19 12:39
 * @version: v1.0.0
 */
public class 前K个高频元素347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        Arrays.stream(nums).forEach(e -> {
            if (map.containsKey(e))
                map.put(e, map.get(e) + 1);
            else
                map.put(e, 1);
        });
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>(k, (a, b) -> a.getKey() - b.getKey());
        map.forEach((key, value) -> {
            if (k == queue.size()) {
                if (value > queue.peek().getKey()) {
                    queue.poll();
                    queue.add(new Pair<>(value, key));
                }
            } else
                queue.add(new Pair<>(value, key));
        });

        List<Integer> list = new ArrayList();
        queue.forEach(e -> {
            list.add(e.getValue());
        });
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new 前K个高频元素347().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }
}
