package Queues;

public class queue_Implement_using_linkedList2 {
   static class Node{
        private int data;
        private Node next;
        Node(int x){
            this.data = x;
            this.next = null;
        }
    }
   static class Queue{
       private Node head , tail;
       private int  size;
       Queue(){
           head = null;
           tail = null;
           size=0;
       }
       void push(int val){
           Node temp = new Node(val);
           if(size==0){
               head=tail=temp;
           }else {
               tail.next = temp;
               tail = temp;
           }
           size++;
       }
       int top(){
           if(size==0){
               System.out.print("Queue is empty...");
               return -1;
           }
           return head.data;
       }
       int remove(){
           if(size==0){
               System.out.print("Stack is empty...");
               return -1;
           }
           int temp = head.data;
           head = head.next;
           size--;
           return temp;
       }
       int size(){
           return size;
       }
       boolean isEmpty(){
           if(size==0)return true;
           else return false;
       }

       void display(){
           Node temp = head;
           while(temp!=null){
               System.out.print(temp.data+" ");
               temp = temp.next;
           }
           System.out.println();
       }
   }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.remove();
        System.out.println(q.top());
        System.out.println(q.size());
        q.display();
    }
}
