package 二叉树与递归;

/**
 * @Description: 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * @author: Arnold
 * @since: 2019/4/19 17:00
 * @version: v1.0.0
 */
public class 相同的树100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q && q == null)
            return true;
        else if (q != null && p == null || q == null && p != null)
            return false;
        else {
            if (p.val != q.val)
                return false;
            else
                return isSameTree(q.left, p.left) && isSameTree(q.right, p.right);
        }
    }
}
