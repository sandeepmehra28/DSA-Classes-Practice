package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Delete_Middle_Element_Stack {
    public static void main(String... args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        int size = st.size();
        deleteMid(st,size);
        while (!st.isEmpty()){
            int n = st.pop();
            System.out.print(n+" ");
        }

    }
    static void deleteMid(Stack<Integer> st, int size){
                ArrayList<Integer> al = new ArrayList<>();
                while(!st.isEmpty()){
                    al.add(st.pop());
                }
                int mid = size/2;
                al.remove(mid);
                for (int i = al.size()-1; i >=0 ; i--) {
                     st.push(al.get(i));
                }
    }

}
