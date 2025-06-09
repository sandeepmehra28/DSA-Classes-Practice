package Stack;

import java.util.Stack;

public class InfixtoPost2 {
    static int pre(char ch){
        if(ch=='+'&& ch=='-')return 1;
        if(ch=='*'||ch=='/')return 2;
        if(ch=='^')return 3;
        return 0;
    }
    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        String str1 = "a+b*c";
        System.out.println(con(str1));
    }
    static String con(String str){
        Stack<Character> op = new Stack<>();
        Stack<String> postfix = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                op.push(ch);
            } else if ((ch >= 'a' && ch <= 'z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')) {
                postfix.push(ch+"");
            } else if (ch==')') {
                while(op.peek()!='('){
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char o = op.pop();
                    postfix.push(v1+v2+o);
                }
                op.pop();
            } else if (ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^') {
                while(!op.isEmpty() && op.peek()!='('&& pre(ch)<=pre(op.peek())){
                    String v2 = postfix.pop();
                    String v1 = postfix.pop();
                    char o = op.pop();
                    postfix.push(v1+v2+o);
                }
                op.push(ch);
            }
        }
        while(!op.isEmpty()){
            String v2 = postfix.pop();
            String v1 = postfix.pop();
            char o = op.pop();
            postfix.push(v1+v2+o);
        }
        return postfix.peek();
    }
}
