package 二叉树与递归;

/**
 * @Description: 给出一个完全二叉树，求出该树的节点个数。
 * @author: Arnold
 * @since: 2019/4/19 17:28
 * @version: v1.0.0
 */
public class 完全二叉树的节点个数222 {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        else
            return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
