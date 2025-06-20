package LinkedList;

public class Insertion_In_LinkedList {
   static class Node<T>{
        T data;
        Node next;
        Node(T val){
            this.data = val;
            this.next = null;
        }
    }
   static   class myLL {
       Node<Integer> head;
       int size;
       myLL(){
           this.head = null;
           this.size=0;
       }
       public void insertNode(int data, int position){
           if(position>size+1 || position<=0){
               System.out.println("Wrong insertion");
               return;
           }
          if(position==1){
              insertHead(data);
              return;
          } else if (position==size+1) {
              insertTail(data);
              return;
          }else{
            int counter =1;
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;
            while(counter<position-1 && temp!=null){
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
          }
       }
       public void insertHead(int data){
           Node<Integer> newNode = new Node<>(data);
           if(head==null){
               head = newNode;
               size++;
               return;
           }
           newNode.next = head;
           head = newNode;
           size++;
       }
       public void insertTail(int data){
           Node<Integer> newNode = new Node<>(data);
           if(head==null){
               head = newNode;
               size++;
               return;
           }
           Node<Integer> temp = head;
           if(temp.next!=null){
               temp = temp.next;
           }
           temp.next = newNode;
           size++;
       }
       public void display(){
           Node<Integer> temp = head;
           while(temp!=null){
               System.out.println("data is -> "+ temp.data);
               temp = temp.next;
           }
       }
   }

    public static void main(String[] args) {
        myLL l = new myLL();
        l.insertTail(10);
        l.insertTail(20);
        l.display();
        System.out.println();
        l.insertHead(30);
        l.display();
        System.out.println();
        l.insertNode(50,3);
        l.display();
    }
}
