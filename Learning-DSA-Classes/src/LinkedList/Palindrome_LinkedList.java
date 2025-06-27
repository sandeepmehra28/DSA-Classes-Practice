package LinkedList;

public class Palindrome_LinkedList {
    static utilNode reverse(utilNode head){
        utilNode temp = head;
        utilNode prev = null;
        while(temp!=null){
            utilNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    static utilNode middle(utilNode head){
        utilNode slow = head;
        utilNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static boolean isPalindrome(utilNode head){
        if(head==null || head.next==null){
            return true;
        }
        utilNode mid = middle(head);
        utilNode tail = reverse(mid);
        utilNode temp = head;
        while(tail!=null){
            if(tail.data != temp.data){
                return false;
            }
            tail = tail.next;
            temp = temp.next;
        }
        return true;
    }


    public static void main(String[] args) {
        utilNode a = new utilNode(10);
        utilNode b = new utilNode(20);
        utilNode c = new utilNode(30);
        utilNode d = new utilNode(20);
        utilNode e = new utilNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(isPalindrome(a));
    }
}
