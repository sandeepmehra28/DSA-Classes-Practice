package Recursion;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numOfSteps(123));
    }
    static int numOfSteps(int num){
        return helper(num,0);
    }
    static int helper(int n, int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
