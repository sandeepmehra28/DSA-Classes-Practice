package Stack;

public class Stack_Implementation_using_LinkedList2 {
   static class Node{//node class
        int val;//data member
        Node next;
        Node(int x){//class node constructor for assigning the value in the data member val
            this.val = x;
            this.next = null; // by default null;
        }
    }
   static class Stack{
        private Node head;
        private int size=0;
        Stack(){
             head = null;
        }
        void push(int x){
            Node temp = new Node(x);
           temp.next=head;
           head = temp;
           size++;
        }
        boolean isEmpty(){
            return head==null;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int popedEl = head.val;
            head = head.next;
            size--;
            return popedEl;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        void display(){
            displayPr(head);
            System.out.println();
        }
       private void displayPr(Node h){
            if(h==null)return;
            displayPr(h.next);
            System.out.print(h.val+" ");
        }
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
    Stack st = new Stack();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.display();
    st.pop();
    st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
    }
}
