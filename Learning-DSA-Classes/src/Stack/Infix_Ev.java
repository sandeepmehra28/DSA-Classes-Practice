package Stack;

import java.util.Stack;

public class Infix_Ev {

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    public static int applyOp(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        String str = "10*20+10";
        Stack<Integer> val = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch>='0' && ch<= '9') {
                int num = 0;
                while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;
                val.push(num);
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                    int b = val.pop();
                    int a = val.pop();
                    char op = ops.pop();
                    val.push(applyOp(a, b, op));
                }
                ops.push(ch);
            }
        }

        while (!ops.isEmpty()) {
            int b = val.pop();
            int a = val.pop();
            char op = ops.pop();
            val.push(applyOp(a, b, op));
        }

        System.out.println(val.pop());
    }
}
