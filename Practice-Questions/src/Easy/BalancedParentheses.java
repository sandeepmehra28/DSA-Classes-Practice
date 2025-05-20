package Easy;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        System.out.println(isBalanced("({[]})")); // true
        System.out.println(isBalanced("([)]"));   // false
        System.out.println(isBalanced("{[()]}")); // true
        System.out.println(isBalanced("{[(])}")); // false
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
}
