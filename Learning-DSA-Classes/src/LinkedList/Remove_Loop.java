package LinkedList;

public class Remove_Loop {
    static utilNode firstNodeCycle(utilNode head) {
        utilNode fast = head;
        utilNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
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
    // Remove the loop if it exists
    static void removeLoop(utilNode head) {
        utilNode loopStart = firstNodeCycle(head);
        if (loopStart == null) return;
        utilNode ptr = loopStart;
        while (ptr.next != loopStart) {
            ptr = ptr.next;
        }
        ptr.next = null;
    }
   static void printList(utilNode head){
        utilNode temp  = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
       System.out.println();
   }
    public static void main(String[] args) {
        utilNode a = new utilNode(10);
        utilNode b = new utilNode(20);
        utilNode c = new utilNode(40);
        utilNode d = new utilNode(50);
        utilNode e = new utilNode(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = b;
        System.out.println(dectectCycle(a));
        removeLoop(a);
        printList(a);
    }
}
