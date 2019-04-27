package 二叉树与递归;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 翻转一棵二叉树。
 * @author: Arnold
 * @since: 2019/4/19 16:39
 * @version: v1.0.0
 */
public class 翻转二叉树226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if (node.right != null)
                queue.add(node.right);
            if (node.left != null)
                queue.add(node.left);
        }
        return root;
    }
}
