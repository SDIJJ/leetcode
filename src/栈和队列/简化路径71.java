package 栈和队列;

import java.util.Stack;

/**
 * @Description: 简化路径71
 * @author: Arnold
 * @since: 2019/4/17 20:39
 * @version: v1.0.0
 */
public class 简化路径71 {
    public String simplifyPath(String path) {
        path+="/";

        Stack<String> stack=new Stack<>();
        char arr [] =path.toCharArray();
        String cur="";

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]=='/'){
                if(cur.equals(".")){

                }else if(cur.equals("..")){
                    if(!stack.empty())
                        stack.pop();
                }else if(cur.length()>0){
                    stack.push(cur);
                }
                cur="";
            }else {
                cur+=arr[i];
            }
        }


        String str=new String();
        while (!stack.empty()){
            str="/"+stack.pop()+str;
        }
        return str.length()==0?"/":str;

    }
}
