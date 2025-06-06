package Stack;

import java.util.Stack;

public class Infix_Ev {
    public static void main(String[] args) {
        String o = "100 * 2 + 12";
        System.out.println(pro(o));
    }
    static int pro(String expr) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                int num = 0;
                // Build multi-digit number
                while (i < expr.length() && Character.isDigit(expr.charAt(i))) {
                    num = num * 10 + (expr.charAt(i) - '0');
                    i++;
                }
                i--; // adjust for loop increment
                operands.push(num);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    char op = operators.pop();
                    operands.push(operations(v1, v2, op));
                }
                if (!operators.isEmpty()) {
                    operators.pop();
                }
            } else if (isOperator(ch)) {
                while (!operators.isEmpty() && operators.peek() != '(' &&
                        precedence(ch) <= precedence(operators.peek())) {
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    char op = operators.pop();
                    operands.push(operations(v1, v2, op));
                }
                operators.push(ch);
            }
        }

        // Final evaluation
        while (!operators.isEmpty()) {
            int v2 = operands.pop();
            int v1 = operands.pop();
            char op = operators.pop();
            operands.push(operations(v1, v2, op));
        }

        return operands.pop();
    }
static boolean isOperator(char ch){
    return ch == '+' || ch == '-' || ch == '*' || ch == '/';
}
    static int precedence(char operator) {
        return  (operator == '+' || operator == '-') ? 1 : 2;
    }

    static int operations(int n1 , int n2, char operator){
        if(operator=='+'){
            return n1+n2;
        } else if (operator=='-') {
            return n1-n2;
        } else if (operator=='*') {
            return n1*n2;
        }else {
            return n1/n2;
        }
    }
}



//package Stack;
//
//import java.util.Stack;
//
//public class Infix_Ev {
//    public static void main(String[] args) {
//        String o = "2+6*4/8";
//        System.out.println(pro(o)); // Should print 5
//    }
//
//    static int pro(String expr) {
//        Stack<Integer> operands = new Stack<>();
//        Stack<Character> operators = new Stack<>();
//
//        for (int i = 0; i < expr.length(); i++) {
//            char ch = expr.charAt(i);
//
//            if (ch == '(') {
//                operators.push(ch);
//            } else if (Character.isDigit(ch)) {
//                operands.push(ch - '0');
//            } else if (ch == ')') {
//                while (!operators.isEmpty() && operators.peek() != '(') {
//                    int v2 = operands.pop();
//                    int v1 = operands.pop();
//                    char op = operators.pop();
//                    operands.push(operations(v1, v2, op));
//                }
//                if (!operators.isEmpty()) {
//                    operators.pop(); // pop '('
//                }
//            } else if (isOperator(ch)) {
//                while (!operators.isEmpty() && operators.peek() != '(' &&
//                        precedence(ch) <= precedence(operators.peek())) {
//                    int v2 = operands.pop();
//                    int v1 = operands.pop();
//                    char op = operators.pop();
//                    operands.push(operations(v1, v2, op));
//                }
//                operators.push(ch);
//            }
//        }
//
//        // Final evaluation
//        while (!operators.isEmpty()) {
//            int v2 = operands.pop();
//            int v1 = operands.pop();
//            char op = operators.pop();
//            operands.push(operations(v1, v2, op));
//        }
//
//        return operands.pop();
//    }
//
//    static boolean isOperator(char ch) {
//        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
//    }
//
//    static int precedence(char operator) {
//        if (operator == '+' || operator == '-') return 1;
//        if (operator == '*' || operator == '/') return 2;
//        return 0;
//    }
//
//    static int operations(int n1, int n2, char operator) {
//        switch (operator) {
//            case '+': return n1 + n2;
//            case '-': return n1 - n2;
//            case '*': return n1 * n2;
//            case '/': return n1 / n2;
//            default: throw new IllegalArgumentException("Invalid operator: " + operator);
//        }
//    }
//}