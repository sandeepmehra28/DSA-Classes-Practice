package LinkedList;


import java.util.Objects;

public class detect_cycle {
    /**
     * detect loop or cycle
     * public static boolean detectLoop(dcNode head) {
     * HashSet<Integer> st = new HashSet<>();
     * while (head != null) {
     * if (st.contains(head))
     * return true;
     * st.add(head);
     * head = head.next;
     * }
     * return false;
     * }
     */
    static boolean dectectCycle(utilNode head){
        utilNode fast = head;
        utilNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    static utilNode firstNodeCycle(utilNode head){
        utilNode fast = head;
        utilNode slow = head;
        boolean found = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                found = true;
                break;
            }
        }
        if(!found){
            return null;
        }
        slow = head;
        while(slow!=fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
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
        e.next = b;
        System.out.println(dectectCycle(a));
        a = firstNodeCycle(a);
        System.out.println(Objects.requireNonNull(a).data);
    }
}
