package LinkedList;

import java.util.Objects;

public class Reverse_K_Groups {
    static int len (utilNode head){
        int counter = 0;
        while(head!=null){
            counter++;
            head = head.next;
        }
        return counter;
    }
    static utilNode reverseKNodes(utilNode head,int k){
        int N = len(head);
        int groups = N/k;
        utilNode prevHead = null;
        utilNode currHead = head;
        utilNode ansNode = null;
        for(int i = 0;i<groups;i++){
            utilNode prev = null;
            utilNode cur = currHead;
            utilNode nextNode;
            for(int j = 0;j<k;j++){
              nextNode = cur.next;
              cur.next = prev;
              prev = cur;
              cur = nextNode;
            }
            if(prevHead ==null){
                ansNode = prev;
            }else{
                prevHead.next = prev;
            }
            prevHead = currHead;
            currHead = cur;
        }
        Objects.requireNonNull(prevHead).next = currHead;
        return ansNode;
    }

    public static void main() {
        utilNode a = new utilNode(10);
        utilNode b = new utilNode(20);
        utilNode c = new utilNode(30);
        utilNode d = new utilNode(40);
        utilNode e = new utilNode(50);
        utilNode f = new utilNode(60);
        utilNode g = new utilNode(70);
        utilNode h = new utilNode(80);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        utilNode ans = reverseKNodes(a,3);
        utilNode.printUtilNodeList(ans);
    }
}
