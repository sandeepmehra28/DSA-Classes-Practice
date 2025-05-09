package Recursion;

public class FactorialNum {
    public static void main(String[] args) {
       int ans= factCall(5);
        System.out.println(ans);
    }
    static int factCall(int n){
        if(n<=1){
            return 1;
        }
           return n*factCall(n-1);
    }
}
