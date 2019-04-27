package 二叉树与递归;

/**
 * @Description: 计算给定二叉树的所有左叶子之和。
 * @author: Arnold
 * @since: 2019/4/26 8:44
 * @version: v1.0.0
 */
public class 左叶子之和404 {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) return 0;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null)
                sum += root.left.val;
            else
                sum += sumOfLeftLeaves(root.left);
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }
}
