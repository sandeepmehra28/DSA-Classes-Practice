package Recursion.Patterns;

public class Pratice {
    public static void main(String[] args) {
        calls2(1);
    }
    static void   calls(int n){
        if(n<1){
            return;
        }
        System.out.println(n);calls(--n);
    }
    static int calls2(int n){
        if(n==10){
            return n;
        }
        System.out.println(n);
        return calls2(n+1);
    }
}
