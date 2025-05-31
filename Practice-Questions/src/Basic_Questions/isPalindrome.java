package Basic_Questions;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.println(isP(500));
    }
    static boolean isP(int n){
        int re =0;
        int temp =Math.abs(n);
        while(temp!=0){
            re = (re*10)+(temp%10);
            temp=temp/10;
        }
        return (re==Math.abs(n));
    }
}
