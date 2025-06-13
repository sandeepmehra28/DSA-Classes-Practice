package LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class understanding {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println(ll);
        Stack<Integer> st =  new Stack<>();
        for(int i = ll.size()-1;i>=0;i--){
            st.push(ll.get(i));
        }
        System.out.println(st);
    }
}
