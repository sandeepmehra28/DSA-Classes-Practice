package Stack;

import java.util.Stack;

public class Min_Stack_Imp_using_Stack {
    static class minStack{
        private Stack<Integer> st ;
        private Stack<Integer> minst ;
        private int size;
        minStack(){
            st = new Stack<>();
            minst = new Stack<>();
            this.size = 0;
        }
        void push(int val){
            st.push(val);
            if (!minst.isEmpty()) {
                minst.push(Math.min(val,minst.peek()));
            } else {
                minst.push(val);
            }
            size++;
        }
         void pop(){
            st.pop();
            minst.pop();
         }
         int top(){
            if(st.isEmpty())return -1;
            else return st.peek();
         }
         int minGet(){
            if(minst.isEmpty())return -1;
            else return minst.peek();
         }

        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        minStack mst = new minStack();
        mst.push(10);
        mst.push(20);
        mst.push(30);
        mst.push(9);
        mst.push(40);
        System.out.println(mst.size());
        System.out.println(mst.minGet());
    }
}
