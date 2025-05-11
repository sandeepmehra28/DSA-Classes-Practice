package Recursion.Easy;

public class Nto1 {
    public static void main(String[] args) {
        Call(5);//call in main method
        System.out.println();
        CallRev(5);
        System.out.println();
        BothCall(5);
    }
    static void Call(int n){
        if(n==0){return;}//this is a base case
        System.out.print(n+" ");//print value
        Call(n-1);//calling
    }
    static void CallRev(int n){
        if(n==0){return;}//this is a base case
        CallRev(n-1);//calling
        System.out.print(n+" ");//print value
    }
    static void BothCall(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");//first print the value then call
        BothCall(n-1);
        System.out.print(n+" ");//after remove in the stack then print the value
    }
}
