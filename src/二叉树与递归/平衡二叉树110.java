package 二叉树与递归;

/**
 * @Description: 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * @author: Arnold
 * @since: 2019/4/19 17:33
 * @version: v1.0.0
 */
public class 平衡二叉树110 {
    private boolean ans = true;

    private int searchDepth(TreeNode node) {
        if (node == null)
            return 0;
        int l = searchDepth(node.left) + 1;
        int r = searchDepth(node.right) + 1;
        if (Math.abs(l-r)>1) {
            ans = false;
            return -1;
        }
        return Math.max(l,r);
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) ans = true;
        searchDepth(root);
        return ans;
    }
}
