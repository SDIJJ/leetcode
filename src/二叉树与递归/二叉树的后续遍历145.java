package 二叉树与递归;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Description: 二叉树的后续遍历145
 * @author: Arnold
 * @since: 2019/4/18 17:37
 * @version: v1.0.0
 */
public class 二叉树的后续遍历145 {

    /**
     * 非递归。。。。。
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
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
                stack.add(new Command("print", command.node));

                if (command.node.right != null)
                    stack.add(new Command("go", command.node.right));

                if (command.node.left != null)
                    stack.add(new Command("go", command.node.left));


            }
        }
        return list;
    }

    public static void main(String[] args) {

      /*  SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Date date=dateFormat.parse("1995/11/11 11:00:00");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/
    }
}


class Command {
    String com;
    TreeNode node;

    public Command(String com, TreeNode node) {
        this.com = com;
        this.node = node;
    }
}
