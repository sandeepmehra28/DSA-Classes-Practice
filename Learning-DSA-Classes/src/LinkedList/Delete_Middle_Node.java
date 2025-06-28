package LinkedList;
public class Delete_Middle_Node {
    static utilNode deleteMid(utilNode head) {
        if (head == null) {
            return null;
        }
        utilNode fast = head;
        utilNode slow = head;
        utilNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev == null) {
            head = null;
        } else {
            prev.next = slow.next;
            slow.next = null;
        }
        return head;
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
        d.next = e;
        a =  deleteMid(a);
        utilNode.printUtilNodeList(a);
    }
}
