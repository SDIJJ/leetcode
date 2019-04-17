package 二叉树与递归;


import java.util.*;

/**
 * @Description: 二叉树的前序遍历144
 * @author: Arnold
 * @since: 2019/4/17 20:56
 * @version: v1.0.0
 */
public class 二叉树的前序遍历144 {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        preOrder(list,root);
        return list;
    }

    private static void preOrder(List list,TreeNode node) {
        if (node != null) {
            list.add(node.val);
            preOrder(list,node.left);
            preOrder(list,node.right);
        }
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
