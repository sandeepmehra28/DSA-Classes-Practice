package Patterns;

public class ArrowheadPattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <n*2 ; i++) {
            int totalc = i>n?2*n-i:i;
            for (int j = 1; j < totalc ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
