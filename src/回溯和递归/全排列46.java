package 回溯和递归;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description: 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * @author: Arnold
 * @since: 2019/4/29 9:06
 * @version: v1.0.0
 */
public class 全排列46 {
    private static List<List<Integer>> list = new ArrayList<>();  //1.此处生声明一个静态List
    private static List<Boolean> isUsed = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) return list;
        for (int i = 0; i < nums.length; i++) isUsed.add(false);
        find(nums, 0, new LinkedList<Integer>());
        System.out.println("结果------> " + list);   //3.此处执行函数，输出list内部为空？。。。。
        return list;
    }

    private static void find(final int[] nums, int index, LinkedList<Integer> res) {
        list.clear();
        if (index == nums.length) {
            list.add((List<Integer>) res.clone());
            System.out.println("过程-----> " + list);  //2.此处向list中添加元素
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!isUsed.get(i)) {
                res.addLast(nums[i]);
                isUsed.set(i, true);
                find(nums, index + 1, res);
                res.removeLast();
                isUsed.set(i, false);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new 全排列46().permute(new int[]{1, 2, 3}));
    }
}
