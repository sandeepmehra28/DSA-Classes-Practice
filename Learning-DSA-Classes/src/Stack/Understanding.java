package Stack;

import java.util.Stack;

public class Understanding {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for(int i  = 1;i<=5;i++){
            st.push(i);
        }
        System.out.println(st);
        System.out.println(st.size()+" size of stack");//size of stack
        System.out.println(st.peek()+" peek element");//show always top element in the stack
        System.out.println(st.pop());//always remove top element in the stack
        System.out.println(st.peek());
        System.out.println(st.search(2));
    }
}
