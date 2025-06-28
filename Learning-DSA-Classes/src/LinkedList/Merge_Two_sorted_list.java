package LinkedList;
public class Merge_Two_sorted_list {
    static utilNode mergeList(utilNode head1,utilNode head2){
        utilNode temp1 = head1;
        utilNode temp2 = head2;
        utilNode head = new utilNode(100);
        utilNode temp = head;
        while(temp1!=null && temp2!=null){
          if(temp1.data<temp2.data){
              utilNode newNode = new utilNode(temp1.data);
              temp.next = newNode;
              temp = newNode;
              temp1 = temp1.next;
          }else{
              utilNode newNode = new utilNode(temp2.data);
              temp.next = newNode;
              temp = newNode;
              temp2 = temp2.next;
          }
        }
        if(temp1==null){
            temp.next = temp2;
        }else{
            temp.next = temp1;
        }
        return head.next;
    }
    static void  print(utilNode head){
        utilNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
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
        utilNode ans = mergeList(a,a1);
        utilNode.printUtilNodeList(ans);
    }
}
