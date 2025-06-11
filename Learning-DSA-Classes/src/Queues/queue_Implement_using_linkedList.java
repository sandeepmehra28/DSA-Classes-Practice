package Queues;

public class queue_Implement_using_linkedList {
    public static class Node{
        private int data;
        private Node next;
        Node(int value){
            this.data=value;
            this.next = null;
        }
    }
    public static class Queue{
        private Node head;
        private Node tail;
        private int size;


        public void add(int val){
             Node temp_val = new Node(val);
             if(size==0){
                 head=tail=temp_val;
             }else{
                 tail.next=temp_val;
                 tail = temp_val;
             }
             size++;
        }

        int size(){
            return size;
        }
        int peek(){
            if(size==0){
                System.out.println("queue is empty..");
                return -1;
            }
            return head.data;
        }
        int remove(){
            if(size==0){
                System.out.println("queue is empty..");
                return -1;
            }
            int temp = head.data;
            head=head.next;
            size--;
            return temp;

        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
   Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.size());
        System.out.println( q.peek());
        System.out.println(q.remove());
        System.out.println(q.size());
        System.out.println( q.peek());
        q.display();
    }
}
