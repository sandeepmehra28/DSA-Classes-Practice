package Recursion.Easy;

public class ProductDigits {
    public static void main(String[] args) {
        int ans=pro(12356);
        System.out.println(ans);
    }
    static  int pro(int n){
        if(n%10==n){
            return n;
        }
        return pro(n/10)*(n%10);
    }
}
