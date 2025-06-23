package LinkedList;
class DNode<T>{
    T data;
    DNode prev;
    DNode next;
    DNode(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLinkedList {
    DNode<Integer> head;
    int size;

    DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    //display dllist
    void display(){
        DNode<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    //insert in head
    void insertHead(int data) {
        DNode<Integer> newNode = new DNode<>(data);
        if (head == null) {
            head = newNode;
            size++;
            System.out.println("insert in head.");
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
        System.out.println("insert in head.");
    }
    //insert in tail
    void insertTail(int data){
        DNode<Integer> newNode = new DNode<>(data);
        if(head==null){
            head= newNode;
            size++;
            System.out.println("insert in tail.");
            return;
        }
        DNode<Integer> temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev= temp;
        size++;
        System.out.println("insert in tail.");
    }
    //insertion specific position
    void insertion(int pos, int data){
        if(pos>size+1 && pos<=0){
            System.out.println("wrong insertion");
            return;
        }
        if(pos==1){
            insertHead(data);
        }if(pos==size+1){
            insertTail(data);
        }else{
            int counter =1;
            DNode<Integer> newNode = new DNode<>(data);
            DNode<Integer> temp = head;
            while(counter<pos-1 && temp!=null){
                counter++;
                temp = temp.next;
            }
            DNode<Integer> currentNode = temp.next;
            newNode.next = currentNode;
            temp.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    //delete head
    void deleteHead(){
        if(head.next==null){
            head = head.next;
            size--;
            System.out.println("delete node head");
            return;
        }
        DNode<Integer> temp = head;
        temp = head;
        head = temp.next;
        head.prev = null;
        temp.next = null;
        System.out.println("delete node head");
    }
    //delete tail
    void deleteTail(){
    if(head.next==null){
        head=head.next;
        size--;
        System.out.println("delete node tail");
    }
    DNode<Integer> temp = head;
    DNode<Integer> pre = null;
    while(temp.next!=null){
        pre = temp;
        temp = temp.next;
    }
    pre.next = null;
    temp.prev = null;
    size--;
        System.out.println("delete node tail");
    }
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertHead(10);
        dl.insertTail(20);
        dl.insertion(3,30);
        dl.deleteHead();
        dl.deleteTail();
        dl.display();
    }
}
