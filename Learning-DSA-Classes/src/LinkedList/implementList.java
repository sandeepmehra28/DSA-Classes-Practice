package LinkedList;

public class implementList {
    static class iNode<T>{
        T data;
        iNode next;
        iNode(T data){
            this.data = data;
            this.next = next;
        }
    }
    static class iList{
        iNode<Integer> head;
        iNode<Integer> tail;
        int size;
        iList(){
            this.head= null;
            this.tail = null;
            this.size = 0;
        }
        void d(){
            if(head==null){
                return;
            }
            iNode<Integer> temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void insertH(int data){
            iNode<Integer> newNode = new iNode<>(data);
            if(head==null){
                head=tail=newNode;
                size++;
                return;
            }
            tail.next = newNode;
            size++;
        }
        void insertT(int data){
            iNode<Integer> newNode = new iNode<>(data);
            if(head==null){
                head=tail=newNode;
                size++;
                return;
            }
            tail.next = newNode;
            size++;
        }
        void insert(int pos,int data){
            if(pos>size+1 && pos<=0){
                return;
            }if(pos==1){
                insertH(data);
            }if(pos==size+1){
                insertT(data);
            }else{
                int counter =1;
                iNode<Integer> newNode = new iNode<>(data);
                iNode<Integer> temp = head;
                while(counter<pos-1 && temp!=null){
                    counter++;
                    temp = temp.next;
                }
                newNode.next=temp.next;
                temp.next=  newNode;
                size++;
            }
        }
        void deleteH(){
            if(head==null){
                return;
            }
            if(head.next==null){
                head = head.next;
                size--;
                return;
            }
            iNode<Integer> temp = head;
            head = head.next;
            temp.next=null;
            size--;
        }
    }

    public static void main(String[] args) {
        iList l = new iList();
        l.insertH(10);
        l.insertT(20);
        l.insertT(30);
        l.insert(2,50);
        l.deleteH();
        l.d();
    }
}
