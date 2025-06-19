package Stack;

import java.util.Stack;

public class Prefix_Eve {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<>();
        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else{
              int v1 = st.pop();
              int v2 = st.pop();
              if(ch=='+')st.push(v1+v2);
                if(ch=='-')st.push(v1-v2);
                if(ch=='/')st.push(v1/v2);
                if(ch=='*')st.push(v1*v2);
            }
        }
        System.out.println(st.peek());
    }
    // prefix to postfix conversion
    static String preToPost(String str) {
        Stack<String> postfix = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                postfix.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                String op1 = postfix.pop();
                String op2 = postfix.pop();
                postfix.push(op1 + op2 + ch);
            }
        }

        return postfix.peek();
    }
    static String preToInfix(String str) {
        Stack<String> infix = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || Character.isDigit(ch)) {
                infix.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%' || ch == '^') {
                String op1 = infix.pop();
                String op2 = infix.pop();
                String expr = "(" + op1 + ch + op2 + ")";
                infix.push(expr);
            }
        }
        return infix.peek();
    }
}
