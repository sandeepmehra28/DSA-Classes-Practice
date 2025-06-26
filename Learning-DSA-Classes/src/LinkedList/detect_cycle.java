package LinkedList;


class dcNode{
    int data;
    dcNode next;
    dcNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class detect_cycle {
    static void  print(dcNode head){
        dcNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
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
    static boolean dectectCycle(dcNode head){
        dcNode fast = head;
        dcNode slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    static dcNode firstNodeCycle(dcNode head){
        dcNode fast = head;
        dcNode slow = head;
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
        dcNode a = new dcNode(10);
        dcNode b = new dcNode(20);
        dcNode c = new dcNode(30);
        dcNode d = new dcNode(40);
        dcNode e = new dcNode(50);
        a.next = b;
        b.next= c;
        c.next=d;
        d.next= e;
        e.next = b;
        System.out.println(dectectCycle(a));
        a = firstNodeCycle(a);
        System.out.println(a.data);
    }
}
