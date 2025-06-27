package LinkedList;
class dmNode{
    int data;
    dmNode next;
    dmNode(int data){
        this.data= data;
        this.next = null;
    }
}
public class Delete_Middle_Node {
    static dmNode deleteMid(dmNode head){
        if(head==null){
            return null;
        }
        dmNode fast = head;
        dmNode slow = head;
        dmNode prev=  null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev==null){
            head = null;
        }else{
            prev.next = slow.next;
            slow.next = null;
        }
        return head;
    }
    static void print(dmNode head){
        dmNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main() {
        dmNode a = new dmNode(10);
        dmNode b = new dmNode(20);
        dmNode c = new dmNode(30);
        dmNode d = new dmNode(40);
        dmNode e = new dmNode(50);
        a.next = b;
        b.next= c;
        c.next=d;
        d.next = e;
        a =  deleteMid(a);
        print(a);
    }
}
