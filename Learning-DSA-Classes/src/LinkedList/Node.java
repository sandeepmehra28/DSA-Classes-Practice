package LinkedList;

public class Node <T>{
    T data;
    Node next;
    Node(T data){
        this.data = data;
        this.next = null;
    }
  static class myll{
        Node<Integer> head;
        int size;
        myll(){
            this.head = null;
            this.size=0;
        }
        void display(){
            Node<Integer> temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void insertHead(int data){
            Node<Integer> newNode = new Node<>(data);
            if (head==null){
                head = newNode;
                size++;
                return;
            }
            head = newNode;
            size++;
        }
        void insertTail(int data){
            Node<Integer> newNode = new Node<>(data);
            if(head==null){
                head = newNode;
                size++;
                return;
            }
            int counter =1;
            Node<Integer> temp = head;
            while(temp.next!=null){
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        void insertion(int position, int data){
            if(position>size+1 && position<=0){
                return;
            }
            if(position==1){
                insertHead(data);
                return;
            }
            if(position==size+1){
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
        void deleteH(Node head){
            if(head==null && head.next==null){
                return;
            }
            head.data = head.next.data;
            head.next = head.next.next;
        }
        void deleteHead(){
           if(head==null){
               return;
           }if(head.next==null){
                head = null;
                size--;
                return;
            }
           Node<Integer> temp = head;
           head = head.next;
           temp.next = null;
            size--;
        }
        void deleteTail(){
            if(head==null){
                return;
            }
            Node<Integer> temp =head;
            Node<Integer> pre = null;
            while(temp.next!=null){
                pre = temp;
                temp = temp.next;
            }
            pre.next = null;
            size--;
        }
        void deletion(int position){
            if(position>size && position<=0){
                return;
            }
            if(position==1){
                deleteHead();
                return;
            }if(position==size){
                deleteTail();
                return;
            }else{
                int counter =1;
                Node<Integer> pre = null;
                Node<Integer> temp = head;
                while(counter<position && temp!=null){
                    counter++;
                    pre = temp;
                    temp = temp.next;
                }
                pre.next = temp.next;
                temp.next=null;
                size--;
            }
        }
        void updadteNode(int position , int data){
            if(head==null){
                return;
            }
            int counter =1;
            Node<Integer> temp = head;
            while(counter<position && temp!=null){
                counter++;
                temp = temp.next;
            }
            if(temp!=null && counter==position){
                temp.data = data;
            }else{
                System.out.println("!");
            }
        }
   }

    public static void main(String[] args) {
        myll l = new myll();
        l.insertHead(10);
        l.insertTail(20);
        l.insertTail(30);
        l.insertTail(40);
        l.insertTail(50);
//        l.insertion(2,30);
//        l.deleteHead();
//        l.deleteTail();
//        l.deletion(1);
        l.updadteNode(3,100);
        l.deletion(3);
        l.display();
    }
}
