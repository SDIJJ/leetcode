package 二叉树与递归.递归的终止条件;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * @author: Arnold
 * @since: 2019/4/26 10:49
 * @version: v1.0.0
 */
public class 二叉树的所有路径257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) return list;
        if (root.left == null && root.right == null) {
            list.add(String.valueOf(root.val));
            return list;
        }
        List<String> leftList = binaryTreePaths(root.left);
        leftList.forEach(e -> list.add(String.valueOf(root.val).concat("->").concat(e)));
        List<String> rightList = binaryTreePaths(root.right);
        rightList.forEach(e -> list.add(String.valueOf(root.val).concat("->").concat(e)));
        return list;
    }
}


//  Definition for a binary tree node.
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
}
