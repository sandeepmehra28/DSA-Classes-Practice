package Stack;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String n1 = "[(a+b)+{(c+d)*(e/f)}]";
        System.out.println(findD(n1));
    }
    static boolean findD(String n){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if(ch=='{'||ch=='['||ch=='('){
                st.push(ch);
            } else if (ch==')') {
             boolean v = handel(st,'(');
             if(!v){
                 return false;
             }
            } else if (ch==']') {
                boolean v = handel(st,'[');
                if(!v){
                    return false;
                }
            } else if (ch=='}') {
                boolean v = handel(st,'{');
                if(!v){
                    return false;
                }
            }else {

            }
        }
        return st.isEmpty();
    }
    static boolean handel(Stack<Character> st, char ch){
        if(st.isEmpty()){
            return false;
        } else if (st.peek()!=ch) {
            return false;
        }else {
            st.pop();
            return true;
        }
    }
}
