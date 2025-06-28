package LinkedList;

public class Odd_Even_List {
    static utilNode oddeven(utilNode head){
        if(head==null || head.next==null){
            return head;
        }
        utilNode odd = head;
        utilNode even = head.next;
        utilNode evenHead = head.next;
        while(odd.next!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next =odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main() {
        utilNode a = new utilNode(10);
        utilNode b = new utilNode(20);
        utilNode c = new utilNode(30);
        utilNode d = new utilNode(40);
        utilNode e = new utilNode(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        utilNode ans = oddeven(a);
        utilNode.printUtilNodeList(ans);
    }
}
