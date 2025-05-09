package Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 0; i <n*2 ; i++) {
            int totalc = i>n?2*n-i:i;
            int nOfSpaces=n-totalc;
            for (int s = 0; s <nOfSpaces ; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalc ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
