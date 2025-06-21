package LinkedList;

public class Deletion_In_LinkedList {
    static class Node<T>{//my node class
        T data;
        Node next;
        Node(T data){
            this.data = data;
            this.next = null;
        }
    }
    // my linked list class
    static class myLinkedList{
        Node<Integer> head;
        int size;
        myLinkedList(){
            this.head = null;
            this.size = 0;
        }
        //update node data
        void updateData(int position , int data){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            int counter = 1;
            Node<Integer> temp = head;
            while(counter<position && temp!=null){
                counter++;
                temp = temp.next;
            }
            if(temp!=null && counter==position){
                temp.data = data;
                System.out.println("update successfull");
            }else{
                System.out.println("size is smaller then your list");
            }
        }
        // delete head node
        void deleteHead(){
            if(head==null){
                System.out.println("List is Empty..");
                return ;
            }
            Node<Integer> temp = head;
            head = head.next;
            temp.next=null;
            size--;
            System.out.println("Delete at head is successful..");
        }
        // delete tail node
        void deleteTail(){
            if(head==null){
                System.out.println("List is Empty..");
                return;
            }
            if(head.next==null){
                head = null;
                size--;
                System.out.println("Delete at Tail is Successful");
                return;
            }
            Node<Integer> temp = head;
            Node<Integer> pre = null;
            while(temp.next!=null){
                pre = temp;
                temp = temp.next;
            }
            pre.next = null;
            System.out.println("Delete at Tail is Successful");
            size--;
        }
        //delete node without using new object
        void deleteNode(Node head){
            if(head==null && head.next==null){
                return;
            }
            head.data = head.next.data;
            head.next = head.next.next;
        }
        void delete(int position){
            if(position>size&& position<=0){
                System.out.println("Wrong Deletion..");
                return;
            }
            if(position==1){
                deleteHead();
                return;
            }
            if(position==size){
                deleteTail();
                return;
            }else{
                int counter = 1;
                Node<Integer> pre = null;
                Node<Integer> temp = head;
                while(counter<position&&temp!=null){
                    counter++;
                    pre = temp;
                    temp = temp.next;
                }
                pre.next = temp.next;
                temp.next = null;
                size--;
                System.out.println("Deletion is successful...");
            }
        }
        void insertHead(int data){
            Node<Integer> newNode = new Node<>(data);
            if(head==null){
                head = newNode;
                size++;
                System.out.println("insertion at head successful");
                return;
            }
            newNode.next = head;
            head=  newNode;
            size++;
            System.out.println("insertion at head successful");
        }
        void insertTail(int data){
            Node<Integer> newNode = new Node<>(data);
            if(head==null){
                head = newNode;
                size++;
                System.out.println("insertion at tail successful");
                return;
            }
            Node<Integer> temp =head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
            System.out.println("insertion at tail successful");
        }
        void insertion(int position , int data){
            if(position>size+1 && position<=0){
                System.out.println("Wrong Insertion");
                return;
            }
            if(position==1){
                insertHead(data);
                return;
            }
            if(position==size+1) {
                insertTail(data);
                return;
            }else{
                Node<Integer> newNode = new Node<>(data);
                Node<Integer> temp = head;
                int current=1;
                while(current<position-1 && temp!=null){
                    current++;
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }
        void display(){
            Node<Integer> temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        myLinkedList l = new myLinkedList();
        l.insertHead(10);
        l.insertTail(20);
        l.insertTail(30);
        l.insertTail(40);
        l.insertTail(50);
        l.display();
        l.insertHead(10);
        l.display();
        l.deleteHead();
        l.display();
        l.insertTail(10);
        l.display();
        l.deleteTail();
        l.display();
        l.delete(3);
        l.display();
        l.updateData(1,20);
        l.display();
    }
}
