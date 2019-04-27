package 二叉树与递归;

import java.util.Map;

/**
 * @Description: 给定一个二叉树，找出其最小深度。
 * @author: Arnold
 * @since: 2019/4/19 16:19
 * @version: v1.0.0
 */
public class 二叉树的最小深度111 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.right != null)
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        else if (root.right != null)
            return minDepth(root.right) + 1;
        else
            return minDepth(root.left) + 1;
    }
}
