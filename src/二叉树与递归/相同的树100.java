package 二叉树与递归;

import static java.lang.Math.*;

/**
 * @Description: 给定两个二叉树，编写一个函数来检验它们是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的
 * @author: Arnold
 * @since: 2019/4/26 7:37
 * @version: v1.0.0
 */
public class 相同的树100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q && q == null)
            return true;
        if (q != null && p != null) {
            if (q.val == p.val)
                return isSameTree(q.left, p.left) && isSameTree(p.right, q.right);
            else
                return false;
        }
        return false;
    }

    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : mirror(root.left, root.right);
    }

    private static boolean mirror(TreeNode node, TreeNode node1) {
        if (node == node1 && node == null)
            return true;
        if (node != null && node1 != null && node.val == node1.val)
            return mirror(node.right, node1.left) && mirror(node.left, node1.right);
        return false;
    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        if (root.right != null && root.left != null)
            return countNodes(root.right) + countNodes(root.left) + 1;
        else if (root.left != null)
            return countNodes(root.left) + 1;
        else
            return countNodes(root.right) + 1;
    }

    static boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        balance(root);
        return isBalanced;
    }

    private static int balance(TreeNode node) {
        if (node == null)
            return 0;
        int l = balance(node.left) + 1;
        int r = balance(node.right) + 1;
        if (Math.abs(l - r) > 1) {
            isBalanced = false;
            return -1;
        } else
            return Math.max(l, r);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null)
            return root.val == sum;
        if (hasPathSum(root.left, sum - root.val))
            return true;
        if (hasPathSum(root.right, sum - root.val))
            return true;
        return false;
    }
}
