package LinkedList;

public class practice {
    static class Node<T>{
        T data;
        Node next;
        Node(T data){
            this.data = data;
            this.next =null;
        }
    }
    static class myLinkedList{
        Node<Integer> head;
        int size;
        myLinkedList(){
            this.head = null;
            this.size = 0;
        }

        void insertHead(int data){
            Node<Integer> newNode = new Node<>(data);
            if(head==null){
                head = newNode;
                size++;
                System.out.println("Insertion in the head successful");
                return ;
            }
            newNode.next = head;
            head = newNode;
            size++;
            System.out.println("Insertion in the head successful");
        }
        void insertTail(int data){
            Node<Integer> newNode = new Node<>(data);
            if(head==null){
                head = newNode;
                size++;
                System.out.println("Insertion in the tail successful");
                return ;
            }
            Node<Integer> temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
            System.out.println("Insertion in the tail successful");
        }
        void display(){
            Node<Integer> temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
         int size(){
            return size;
         }
        void insertion(int position, int data){
            if(position>size+1 && position<=0){
                System.out.println("wrong position");
                return;
            }
            if(position==1){
                 insertHead(data);
                 return;
            }
            if(position==size+1){
                insertTail(data);
                return;
            }
            else{
                int counter = 1;
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
    }

    public static void main(String[] args) {
        myLinkedList l = new myLinkedList();
        l.insertHead(10);
        l.insertTail(20);
        l.insertTail(30);
        l.insertTail(40);
        l.insertTail(50);
        l.display();
        l.insertHead(5);
        l.display();
        l.insertion(l.size(),55);
        l.display();
    }
}
