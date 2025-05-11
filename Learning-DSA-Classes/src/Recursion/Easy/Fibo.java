package Recursion.Easy;

public class Fibo {
    public static void main(String[] args) {
        int ans = fibon(4);
        System.out.println(ans);
    }
    static int fibon(int n){
        if(n<2){return n;}//base condition
        return fibon(n-1)+fibon(n-2);
    }
}
