package LinkedList;

public class Add_Two_Numbers {
   static utilNode addTwoNumbers(utilNode l1, utilNode l2){
       utilNode head = null;
       utilNode temp = null;
    int carr = 0;
       while(l1!=null || l2!=null||carr!=0){
           int v1 = (l1==null)?0:l1.data;
           int v2 = (l2==null)?0:l2.data;
           int val = v1+v2+carr;
           utilNode newNode = new utilNode(val%10);
           carr=val/10;
           if(head==null){
               head=newNode;
               temp=newNode;
           }else{
               temp.next=newNode;
               temp = temp.next;
           }
           if(l1!=null){
               l1 = l1.next;
           }
           if(l2!=null){
               l2 = l2.next;
           }
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
        utilNode a1 = new utilNode(11);
        utilNode b1 = new utilNode(22);
        utilNode c1 = new utilNode(33);
        utilNode d1 = new utilNode(44);
        utilNode e1 = new utilNode(55);
        a1.next = b1;
        b1.next= c1;
        c1.next=d1;
        d1.next = e1;
        utilNode ans = addTwoNumbers(a,a1);
        utilNode.printUtilNodeList(ans);
    }
}
