package LinkedList;

public class middle_Node_LinkedList {
  static class Node<T>{
      T data;
      Node next;
      Node(T data){
          this.data = data;
          this.next = null;
      }
  }
  static class mylist{
      Node<Integer> head;
      int size;
      mylist(){
          this.head = null;
          this.size = 0;
      }
      void insertHead(int data){
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
      void insertTail(int data){
          Node<Integer> newNode = new Node<>(data);
          if(head==null){
              head = newNode;
              size++;
              return;
          }
          Node<Integer> temp = head;
          while(temp.next!=null){
              temp = temp.next;
          }
          temp.next = newNode;
          size++;
      }
      Integer findMid(){
          Node<Integer> fast = head;
          Node<Integer> slow =head;
          while(fast!=null && fast.next!=null){
              slow = slow.next;
              fast = fast.next.next;
          }
          return slow.data;
      }
      public void display(){
          Node<Integer> temp = head;
          while(temp!=null){
              System.out.print(temp.data+" ");
              temp = temp.next;
          }
          System.out.println();
      }
  }
    public static void main(String[] args) {
        mylist l = new mylist();
        l.insertHead(10);
        l.insertTail(20);
        l.insertTail(30);
        l.insertTail(40);
        l.insertTail(50);
        l.display();
        System.out.println(l.findMid());
    }
}
