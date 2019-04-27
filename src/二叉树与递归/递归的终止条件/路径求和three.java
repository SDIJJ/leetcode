package 二叉树与递归.递归的终止条件;

/**
 * @Description: 给定一个二叉树，它的每个结点都存放着一个整数值。 找出路径和等于给定数值的路径总数。
 * <p>
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * @author: Arnold
 * @since: 2019/4/26 15:30
 * @version: v1.0.0
 */
public class 路径求和three {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int count = findPath(root, sum);
        count += pathSum(root.left, sum);
        count += pathSum(root.right, sum);
        return count;
    }

    private static int findPath(TreeNode node, int sum) {
        if (node == null) return 0;
        int count = 0;
        if (node.val == sum)
            count++;
        count += findPath(node.left, sum - node.val);
        count += findPath(node.right, sum - node.val);
        return count;
    }
}
