package Recursion;

public class Concept {
    public static void main(String[] args) {
     Con(5);
    }
    static void Con(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
         Con(--n);//print n in decreasing order
        //Con(n--);//postDecrease give a stackOverflow exception
    }
}
