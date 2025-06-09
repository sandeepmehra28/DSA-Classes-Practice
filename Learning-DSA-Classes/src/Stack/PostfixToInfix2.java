package Stack;

import java.util.Stack;

public class PostfixToInfix2 {
    public static void main(String[] args) {
        String str = "ABC/-AK/L-*";
        System.out.println(infixEve(str));
    }
    static String infixEve(String str){
        Stack<String> infix = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='('){
                op.push(ch);
            } else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
                infix.push(ch+"");
            } else if (ch==')') {
                while(op.peek()!='('){
                    String v2 = infix.pop();
                    String v1 = infix.pop();
                    char temp = op.pop();
                    infix.push(v1+temp+v2);
                }
                op.pop();
            } else if (ch=='+'||ch=='-'||ch=='*'||ch=='/') {
                while(!op.isEmpty() && op.peek()!='(' && pre(ch)<=pre(op.peek())){
                    String v2 = infix.pop();
                    String v1 = infix.pop();
                    char temp = op.pop();
                    infix.push(v1+temp+v2);
                }
                op.push(ch);
            }
        }
        while(!op.isEmpty()){
            String v2 = infix.pop();
            String v1 = infix.pop();
            char temp = op.pop();
            infix.push(v1+temp+v2);
        }
        return infix.peek();
    }
    static int pre(char ch){
        if(ch=='+' || ch=='-')return 1;
        if(ch=='*' || ch=='/')return 2;
        return 0;
    }
}
