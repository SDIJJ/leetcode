package 二叉树与递归.二分搜索树;

/**
 * @Description:
 * @author: Arnold
 * @since: 2019/4/26 15:51
 * @version: v1.0.0
 */
public class 二分搜索树的最近公共祖先235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p, q);
        if (q.val < root.val && p.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int x, TreeNode left) {
        val = x;
        left = left;
    }

    public static void main(String[] args) {
        String s="xxxxxxxxxxxxxxx#123#456zzzzz";
        int n = s.indexOf("#");
        int k=s.indexOf("#",n+1);
        String s2=s.substring(n+2,k);
        System.out.println(s2);
    }
}
