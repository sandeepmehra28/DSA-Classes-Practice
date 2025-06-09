package Stack;

import java.util.Stack;

public class InfixToPrefix {
    public static void main() {
        String infix = "9-(5+3)*4/6";
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isDigit(ch)) {
                val.push("" + ch);
            } else if (ch == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (!op.isEmpty() && op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char c = op.pop();
                    String t = c + v1 + v2;
                    val.push(t);
                }
                 op.pop();
            } else {
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    if (op.peek() == '(') break;
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char c = op.pop();
                    String t = c + v1 + v2;
                    val.push(t);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char c = op.pop();
            String t = c + v1 + v2;
            val.push(t);
        }

        String prefix = val.pop();
        System.out.println(prefix);
    }

   public static int precedence(char ch) {
        if(ch=='+'||ch=='-')return 1;
        if(ch=='*'||ch=='/')return 2;
         return 0;
        }

}


