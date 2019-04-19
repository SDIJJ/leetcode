package 二叉树与递归.递归终止条件;


/**
 * @Description: 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * @author: Arnold
 * @since: 2019/4/19 19:58
 * @version: v1.0.0
 */
public class 路径总和112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (sum == 0)
            return true;
        if (root.left == null && root.right == null)
            return sum == root.val;
        if (root.left != null)
            hasPathSum(root.left, sum - root.val);
        if (root.right != null)
            hasPathSum(root.right, sum - root.val);
        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
