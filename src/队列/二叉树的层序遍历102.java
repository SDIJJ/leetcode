package 队列;


import java.util.*;

/**
 * @Description: 二叉树的层序遍历102
 * @author: Arnold
 * @since: 2019/4/17 21:18
 * @version: v1.0.0
 */
public class 二叉树的层序遍历102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> listTemp = new ArrayList();
            while (count > 0) {
                TreeNode node = queue.poll();
                listTemp.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
            list.add(listTemp);
        }
        return list;
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

