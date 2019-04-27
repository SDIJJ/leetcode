package 二叉树与递归;

import java.util.Map;

/**
 * @Description: 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * @author: Arnold
 * @since: 2019/4/19 16:12
 * @version: v1.0.0
 */
public class 二叉树的最大深度104 {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        } else
            return 0;
    }
}
