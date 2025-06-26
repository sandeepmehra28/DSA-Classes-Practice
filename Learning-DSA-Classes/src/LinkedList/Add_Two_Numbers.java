package LinkedList;
class ln{
    int data;
    ln next;
    ln(int data){
        this.data = data;
        this.next = null;
    }
}
public class Add_Two_Numbers {
   static ln addTwoNumbers(ln l1, ln l2){
    ln head = null;
    ln temp = null;
    int carr = 0;
       while(l1!=null || l2!=null||carr!=0){
           int v1 = (l1==null)?0:l1.data;
           int v2 = (l2==null)?0:l2.data;
           int val = v1+v2+carr;
           ln newNode = new ln(val%10);
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
    static void  print(ln head){
       ln temp = head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
        System.out.println();
    }
    public static void main() {
        ln a = new ln(10);
        ln b = new ln(20);
        ln c = new ln(30);
        ln d = new ln(40);
        ln e = new ln(50);
        a.next = b;
        b.next= c;
        c.next=d;
        d.next = e;
        ln a1 = new ln(11);
        ln b1 = new ln(22);
        ln c1 = new ln(33);
        ln d1 = new ln(44);
        ln e1 = new ln(55);
        a1.next = b1;
        b1.next= c1;
        c1.next=d1;
        d1.next = e1;
        ln ans = addTwoNumbers(a,a1);
        print(ans);
    }
}
