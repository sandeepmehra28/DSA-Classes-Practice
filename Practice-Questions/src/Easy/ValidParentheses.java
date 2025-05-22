package Easy;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})")); // true
        System.out.println(isBalanced("([)]"));   // false
        System.out.println(isBalanced("{[()]}")); // true
        System.out.println(isBalanced("{[(])}")); // false

        System.out.println(isBalancedA("({[]})"));
        System.out.println(isBalancedA("([)]"));
        System.out.println(isBalancedA("{[()]}"));
        System.out.println(isBalancedA("{[(])}"));
    }
    static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(c==']'||c=='}'||c==')'){
                  if(stack.isEmpty()){
                      return false;
                  }
                  char top =stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    static String isBalancedA(String s){
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else if(c==']'||c=='}'||c==')'){
                if(stack.isEmpty()){
                    return "NO";
                }
                char top =stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return "NO";
                }
            }
        }
        return stack.isEmpty()?"YES":"NO";
    }
}
