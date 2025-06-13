package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_Using_Queues {
static class MyStack{
     Queue<Integer> q1;
     Queue<Integer> q2;
     public MyStack(){
         q1 = new LinkedList<>();
         q2 = new LinkedList<>();
     }
     public void push(int x){
         if(q1.isEmpty()){
             q1.add(x);
         }else{
             while(!q1.isEmpty()){
                 q2.add(q1.poll());
             }
             q1.add(x);
             while(!q2.isEmpty()){
                 q1.add(q2.poll());
             }
         }
     }
    public int pop() {
        if(q1.isEmpty())return -1;
        return q1.remove();
    }
    public int top() {
      if(q1.isEmpty())return -1;
      return q1.peek();
    }
    public boolean empty() {
       return q1.isEmpty();
    }
    public void display(){
         System.out.print(q1+" ");
        System.out.println();
    }
 }
 //second approach
   static class MyStack2 {
        Queue<Integer> q;
        public MyStack2() {
            q = new  LinkedList<>();
        }

        public void push(int x) {
            q.add(x);
        }

        public int pop() {
            for(int i = 1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int temp = q.remove();
            return temp;
        }

        public int top() {
            for(int i = 1;i<=q.size()-1;i++){
                q.add(q.remove());
            }
            int temp = q.peek();
            q.add(q.remove());
            return temp;
        }

        public boolean empty() {
            if(q.size()==0)return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
          obj.push(10);
          obj.push(20);
          obj.display();
          obj.pop();
          obj.display();
          obj.empty();
    }
}
