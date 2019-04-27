package 二叉树与递归.递归的终止条件;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * @author: Arnold
 * @since: 2019/4/26 11:04
 * @version: v1.0.0
 */
public class 路径总和two113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        if (root.left == null && root.right == null && root.val == sum) {
            List<Integer> integerlist = new ArrayList<>();
            integerlist.add(root.val);
            list.add(integerlist);
            return list;
        }
        List<List<Integer>> leftList = pathSum(root.left, sum - root.val);
        leftList.forEach(e -> {
            List list1 = new ArrayList();
            list1.add(root.val);
            list1.addAll(e);
            list.add(list1);
        });
        List<List<Integer>> rightList = pathSum(root.right, sum - root.val);
        rightList.forEach(e -> {
            List list1 = new ArrayList();
            list1.add(root.val);
            list1.addAll(e);
            list.add(list1);
        });
        return list;
    }
}
