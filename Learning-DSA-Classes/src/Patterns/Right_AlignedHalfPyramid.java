package Patterns;

public class Right_AlignedHalfPyramid {
    public static void main(String[] args) {
        rA(4);
    }
    static void rA(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
