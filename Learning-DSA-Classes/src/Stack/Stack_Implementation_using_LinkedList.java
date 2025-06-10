package Stack;

public class Stack_Implementation_using_LinkedList {
   public static class Node{
        int val ;
        Node next;
       Node(int x){
           this.val = x;
       }
    }
    public static class Stack{
      private Node head = null;
      private int size = 0;

       void push(int x){
           Node temp = new Node(x);
           temp.next = head;
           head=temp;
           size++;
       }
       void displayRev(Node h){
           if(h==null)return;
           displayRev(h.next);
           System.out.print(h.val+" ");
       }
       void display(){
           displayRev(head);
           System.out.println();
       }
       int size(){
           return size;
       }
       int pop(){
           if(head==null){
               System.out.print("Stack is empty !!");
               return -1;
           }
           int x = head.val;
           head = head.next;
           return x;
       }
       int peek(){
           if(head==null){
               System.out.print("Stack is empty !!");
               return -1;
           }
           return head.val;
       }
       boolean isEmpty(){
           if(size==0){
               return true;
           }else {
               return false;
           }

       }
    }

    public static void main(String[] args) {
     Stack st = new Stack();
     st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.size());
        st.pop();
        System.out.println(st.peek());
        st.display();
    }
}
