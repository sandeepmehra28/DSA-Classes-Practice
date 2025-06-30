package LinkedList;

public class utilNode {
    int data;
    utilNode next;
   public utilNode(int data){
        this.data = data;
        this.next = null;
    }
    public utilNode(int data, utilNode next){
       this.data = data;
       this.next = next;
    }
    public static void  printUtilNodeList(utilNode head){
       utilNode temp = head;
       while(temp!=null){
           System.out.print(temp.data+" ");
           temp = temp.next;
       }
        System.out.println();
    }
}
