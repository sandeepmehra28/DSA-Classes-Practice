package Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Implement_Queue_Using_Stacks {
   static class MyQueue {
        Stack<Integer> st;
        Stack<Integer> st1;
        public MyQueue() {
            st= new Stack<>();
            st1 = new Stack<>();
        }

        public void push(int x) {
            st.push(x);
        }

        public int pop() {
            if(st.isEmpty())return -1;
            while(!st.isEmpty()){
                st1.add(st.pop());
            }
            int temp = st1.pop();
            while(!st1.isEmpty()){
                st.add(st1.pop());
            }
            return temp;
        }

        public int peek() {
          if(st.isEmpty())return -1;
            while(!st.isEmpty()){
                st1.add(st.pop());
            }
            int temp = st1.peek();
            while(!st1.isEmpty()){
                st.add(st1.pop());
            }
            return temp;
        }

        public boolean empty() {
            if(st.isEmpty())return true;
            else return false;
        }
        void display(){
            if(st.isEmpty())return;
            System.out.print(st+" ");
            System.out.println();
        }
    }


    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        q.display();
        System.out.println(q.pop()+" this value are removed");
        q.display();
        System.out.println(q.peek());
        System.out.println(q.empty());
    }
}
