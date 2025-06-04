package StackP;

import java.util.Stack;

public class validPar {
    public static void main(String[] args) {
        String n = "()(())";
        String n1 ="(()()";
        System.out.println(fv(n1));
    }
    static int fv(String s){
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) {
                    return 0;
                }
                st.pop(); // Matching '(' found and removed
            }
        }
        return st.isEmpty() ? 1 : 0;
    }
}
