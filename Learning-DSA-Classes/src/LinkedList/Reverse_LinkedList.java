package LinkedList;
class pnode {
    int data;
    pnode next;
    pnode(int data) {
        this.data = data;
    }
}
public class Reverse_LinkedList {
   static pnode reverseList(pnode head) {
        pnode temp = head;
        pnode prev = null;
        pnode next;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp ;
            temp = next;
        }
           return prev;
    }
    static void  print(pnode head){
        pnode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        pnode a = new pnode(10);
        pnode b = new pnode(20);
        pnode c = new pnode(30);
        pnode d = new pnode(40);
        pnode e = new pnode(50);
        a.next = b;
        b.next= c;
        c.next=d;
        d.next= e;
        a = reverseList(a);
        print(a);
    }
}
