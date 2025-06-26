package LinkedList;

public class Pairwise_Swap_Elements {
  static class listNode<T>{
        T data ;
        listNode<T> next;
        listNode(T data){
            this.data = data;
            this.next = null;
        }
    }
    static class mylist{
      listNode<Integer> head;
      int size;
      mylist(){
          this.head = null;
          this.size = 0;
      }

      void ihead(int data){
          listNode<Integer> newNode  = new listNode<>(data);
          if(head==null){
              head=newNode;
              size++;
              return;
          }
          newNode.next = head;
          head = newNode;
          size++;
      }
      void itail(int data){
          listNode<Integer> newNode = new listNode<>(data);
          if(head==null){
              head=newNode;
              size++;
              return;
          }
          listNode<Integer> temp = head;
          while(temp.next!=null){
              temp=temp.next;
          }
          temp.next = newNode;
          size++;
      }
     void print(){
          listNode<Integer> temp = head;
          while(temp!=null){
              System.out.print(temp.data+" ");
              temp  = temp.next;
          }
         System.out.println();
     }
         void swapping(){
          listNode<Integer> curr = head;
          while(curr!=null && curr.next!=null){
              Integer temp = curr.data;
              curr.data = curr.next.data;
              curr.next.data = temp;
              curr = curr.next.next;
          }

     }
        //pair wise swap nodes
        void swapnode(){
            listNode<Integer> first = head;
            listNode<Integer> prev = null;
            while(first!=null&&first.next!=null){
                listNode<Integer> second = first.next;
                first.next = second.next;
                second.next = first;
                if(prev==null){
                    head = second;
                }else{
                    prev.next = second;
                }
                prev = first;
                first = first.next;
            }
        }
    }

    public static void main() {
        mylist l = new mylist();
        l.ihead(10);
        l.itail(20);
        l.itail(30);
        l.itail(40);
        l.itail(50);
        l.itail(60);
        //l.swapping();
        l.swapnode();
        l.print();
    }
}
