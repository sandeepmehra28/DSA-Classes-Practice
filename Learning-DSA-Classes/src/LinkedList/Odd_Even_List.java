package LinkedList;

public class Odd_Even_List {
    // odd even list
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
    //even odd list
    // data input 6 5 4 3 2 1 -1
    static utilNode evenOdd(utilNode head){
        if(head==null||head.next==null){
            return head;
        }
        utilNode evenHead = null,evenTail = null;
        utilNode oddHead = null,oddTail = null;
        utilNode temp = head;
        while(temp!=null){
            if(temp.data%2==0){
                if(evenHead==null){
                    evenHead = evenTail = temp;
                }else{
                    evenTail.next = temp;
                    evenTail = evenTail.next;
                }
            }else{
                if(oddHead==null){
                    oddHead = oddTail = temp;
                }else{
                    oddTail.next = temp;
                    oddTail  = oddTail.next;
                }
            }
            temp = temp.next;
        }
        if(evenHead==null)return oddHead;
        evenTail.next = oddHead;
        if(oddTail!=null) oddTail.next = null;
        return evenHead;
    }
    public static void main() {
        utilNode a = new utilNode(6);
        utilNode b = new utilNode(5);
        utilNode c = new utilNode(4);
        utilNode d = new utilNode(3);
        utilNode e = new utilNode(2);
        utilNode f = new utilNode(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        utilNode ans = evenOdd(a);
        utilNode.printUtilNodeList(ans);
    }
}
