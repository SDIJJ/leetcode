package 二叉树与递归.递归的终止条件;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Description: 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 * @author: Arnold
 * @since: 2019/4/26 11:24
 * @version: v1.0.0
 */
public class 求根到叶子节点数字之和495 {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        for (String s : sum(root))
            sum += Integer.parseInt(s);
        return sum;
    }

    private static List<String> sum(TreeNode node) {
        List<String> list = new ArrayList<>();
        if (node == null) return list;
        if (node.right == null && node.left == null) {
            list.add(String.valueOf(node.val));
            return list;
        }
        sum(node.left).forEach(e -> list.add(String.valueOf(node.val).concat(e)));
        sum(node.right).forEach(e -> list.add(String.valueOf(node.val).concat(e)));
        return list;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(4);
        TreeNode node8 = new TreeNode(7);
        node.left = node1;
        node1.left = node2;
        node2.left = node3;
        node3.left = node4;
        node4.left = node5;
        node5.left = node6;
        node6.left = node7;
        node7.left = node8;
        System.out.println(new 求根到叶子节点数字之和495().sumNumbers(node));
    }
}
