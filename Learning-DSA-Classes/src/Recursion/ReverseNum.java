package Recursion;

public class ReverseNum {
    static int sum=0;
    static void revN1(int n){
        if(n==0){
            return;
        }
        int re =n%10;
        sum=sum*10+re;
        revN1(n/10);
    }
    public static void main(String[] args) {
        revN1(12345);
        System.out.println(sum);
    }

}
