package 二叉树与递归;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Description: 二叉树的前序遍历144
 * @author: Arnold
 * @since: 2019/4/17 20:56
 * @version: v1.0.0
 */
public class 二叉树的前序遍历144 {


    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();
        preOrder(list, root);
        return list;
    }

    private static void preOrder(List list, TreeNode node) {
        if (node != null) {
            list.add(node.val);
            preOrder(list, node.left);
            preOrder(list, node.right);
        }
    }


    /*
     * @Description: 非递归前序遍历
     * @param
     * @throws
     * @retrun
     * @author Arnold
     * @version v1.0.0
     * @since: 2019/4/18 17:23
     */
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> list = new ArrayList();
        if (root == null)
            return list;
        Stack<Command> stack = new Stack<>();
        stack.add(new Command("go", root));
        while (!stack.isEmpty()) {
            Command command = stack.pop();
            if (command.com.equals("print"))
                list.add(command.node.val);
            else {
                assert command.com.equals("go");
                if (command.node.right != null)
                    stack.add(new Command("go", command.node.right));

                if (command.node.left != null)
                    stack.add(new Command("go", command.node.left));

                stack.add(new Command("print", command.node));
            }
        }
        return list;
    }

    class Command {
        String com;
        TreeNode node;

        public Command(String com, TreeNode node) {
            this.com = com;
            this.node = node;
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
