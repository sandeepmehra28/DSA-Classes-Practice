package LinkedList;
class sNode{
    int data;
    sNode next;
    sNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class Merge_Two_sorted_list {
    static sNode mergeList(sNode head1,sNode head2){
        sNode temp1 = head1;
        sNode temp2 = head2;
        sNode head = new sNode(100);
        sNode temp = head;
        while(temp1!=null && temp2!=null){
          if(temp1.data<temp2.data){
              sNode newNode = new sNode(temp1.data);
              temp.next = newNode;
              temp = newNode;
              temp1 = temp1.next;
          }else{
              sNode newNode = new sNode(temp2.data);
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
    static void  print(sNode head){
        sNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main() {
        sNode a = new sNode(10);
        sNode b = new sNode(20);
        sNode c = new sNode(30);
        sNode d = new sNode(40);
        sNode e = new sNode(50);
        a.next = b;
        b.next= c;
        c.next=d;
        d.next = e;
        sNode a1 = new sNode(11);
        sNode b1 = new sNode(22);
        sNode c1 = new sNode(33);
        sNode d1 = new sNode(44);
        sNode e1 = new sNode(55);
        a1.next = b1;
        b1.next= c1;
        c1.next=d1;
        d1.next = e1;
        sNode ans = mergeList(a,a1);
        print(ans);
    }
}
