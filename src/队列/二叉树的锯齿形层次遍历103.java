package 队列;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

/**
 * @Description: 二叉树的锯齿形层次遍历
 * @author: Arnold
 * @since: 2019/4/18 15:59
 * @version: v1.0.0
 */
public class 二叉树的锯齿形层次遍历103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList();
        if (root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int cc = 0;
        while (!queue.isEmpty()) {

            int count = queue.size();
            List<Integer> integers = new ArrayList();
            while (count > 0) {
                TreeNode node = queue.poll();
                integers.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
            if (cc % 2 == 1) {
                List<Integer> list1 = new ArrayList();
                for (int i = integers.size() - 1; i >= 0; i--) {
                    list1.add(integers.get(i));
                }
                integers = list1;
            }
            cc++;
            list.add(integers);
        }
        return list;
    }
}
