package 栈和队列;

import java.util.Stack;

/**
 * @Description: 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * @author: Arnold
 * @since: 2019/4/17 19:30
 * @version: v1.0.0
 */
public class 有效的括号20 {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[')
                stack.add(chars[i]);
            if (chars[i] == ')' || chars[i] == '}' || chars[i] == ']') {
                if (stack.isEmpty())
                    return false;
                char temp = stack.pop();
                if (!compare(temp, chars[i]))
                    return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean compare(char ch1, char ch2) {
        return (ch1 == '{' && ch2 == '}') || (ch1 == '(' && ch2 == ')') || (ch1 == '[' && ch2 == ']');
    }

    public static void main(String[] args) {
        System.out.println(new 有效的括号20().isValid("()[]}"));
    }

}
