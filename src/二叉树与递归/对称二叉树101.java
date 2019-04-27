package 二叉树与递归;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/19 17:17
 * @version: v1.0.0
 */
public class 对称二叉树101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return mirror(root.left, root.right);
    }

    private static boolean mirror(TreeNode l, TreeNode r) {
        if (l == r && r == null)
            return true;
        else if (l == null && r != null || r == null && l != null || l.val != r.val)
            return false;
        else
            return mirror(l.right, r.left) && mirror(l.left, r.right);
    }
}
