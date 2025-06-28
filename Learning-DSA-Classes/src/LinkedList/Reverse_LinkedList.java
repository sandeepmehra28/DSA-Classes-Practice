package LinkedList;
public class Reverse_LinkedList {
   static utilNode reverseList(utilNode head) {
       utilNode temp = head;
       utilNode prev = null;
       utilNode next;
        while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp ;
            temp = next;
        }
           return prev;
    }
    public static void main() {
        utilNode a = new utilNode(10);
        utilNode b = new utilNode(20);
        utilNode c = new utilNode(30);
        utilNode d = new utilNode(40);
        utilNode e = new utilNode(50);
        a.next = b;
        b.next= c;
        c.next=d;
        d.next= e;
        a = reverseList(a);
        utilNode.printUtilNodeList(a);
    }
}
