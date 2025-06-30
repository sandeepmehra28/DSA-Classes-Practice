package LinkedList;

import java.util.Scanner;

public class Remove_Nth_Node_From_The_End {
    static utilNode removeNthNodeFromEnd(utilNode head, int n){
        utilNode first = head;
        utilNode second = head;
        while(n > 0 && second != null){
            n--;
            second = second.next;
        }
        //if n is a large number and your list is small....
        if(n > 0 || second==null) {
            return head.next;
        }
        utilNode prev = null;
        while(second != null){
            second = second.next;
            prev = first;
            first = first.next;
        }
        if(prev!=null && first!=null){
            prev.next = first.next;
        }
        return head;
    }
    public static utilNode removeNthFromEnd(utilNode head, int n) {
        utilNode temp = new utilNode(0, head);
        utilNode first = temp;
        utilNode second = head;

        while (n > 0) {
            second = second.next;
            n--;
        }

        while (second != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;
        return temp.next;
    }
    public static void main() {
        utilNode a = new utilNode(10);
        utilNode b = new utilNode(20);
        utilNode c = new utilNode(30);
        utilNode d = new utilNode(20);
        utilNode e = new utilNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        utilNode ans = removeNthNodeFromEnd(a, 2);
        utilNode.printUtilNodeList(ans);
    }
}
