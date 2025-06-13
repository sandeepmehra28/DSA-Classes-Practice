package Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Reverse_First_K_Element_In_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
         q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        System.out.println(revK(q,k));
    }
    static Queue<Integer> revK(Queue<Integer> q , int k){
        if(q==null||q.isEmpty()||k<=0||k>q.size()){
            return q;
        }
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ;i<k;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i = 0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        return q;
    }
}
