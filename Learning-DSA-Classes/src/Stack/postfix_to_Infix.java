package Stack;

import java.util.Stack;

public class postfix_to_Infix {
    public static void main(String[] args) {
        String op = "abc+/dg-dg+s+s*";
        System.out.println(postToInfix(op));
    }
    static String postToInfix(String exp) {
        // code here
        Stack<String> st = new Stack<>();
        for(char ch : exp.toCharArray()){
            if(isOp(ch)){
                st.push(String.valueOf(ch));
            }else if(isOperator(ch)) {
                String iv2 = st.pop();
                String iv1 = st.pop();
                st.push("(" + iv1 + ch + iv2 + ")");
            }
        }
        return st.peek();
    }
    static boolean isOp(char ch){
        return (ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z');
    }
    static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
