package 队列;

import java.util.*;

/**
 * @Description: 二叉树的右视图
 * @author: Arnold
 * @since: 2019/4/18 16:19
 * @version: v1.0.0
 */
public class 二叉树的右视图199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList();
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            while (count > 0) {
                TreeNode node = queue.poll();
                if (count == 1)
                    list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
        }
        return list;
    }
}
