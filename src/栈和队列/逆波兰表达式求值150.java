package 栈和队列;

import java.util.Stack;

/**
 * @Description: 根据逆波兰表示法，求表达式的值
 * @author: Arnold
 * @since: 2019/4/17 20:08
 * @version: v1.0.0
 */
public class 逆波兰表达式求值150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <tokens.length ; i++) {
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int temp=stack.pop();
                if(tokens[i].equals("+"))
                 stack.add(stack.pop()+temp);
                 else if(tokens[i].equals("-"))
                    stack.add(stack.pop()-temp);
                 else if(tokens[i].equals("*"))
                    stack.add(stack.pop()*temp);
                 else
                    stack.add(stack.pop()/temp);

            } else
                stack.add(Integer.parseInt(tokens[i]));
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        System.out.println(new 逆波兰表达式求值150().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
    }
}
