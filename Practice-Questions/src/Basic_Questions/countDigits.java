package Basic_Questions;

public class countDigits {
    public static void main(String[] args) {
        int num = 234534;
        System.out.println(CountD(num));
    }
    static int CountD(int n){
       if(n==0){
           return 1;
       }
       int count =0;
       while (n!=0){
           n=n/10;
           count++;
       }
       return count;
    }
}
