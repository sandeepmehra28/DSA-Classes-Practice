package Patterns;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        for(int  i = 0;i<=4;i++){
            for(int  j = 5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for (int i = 1; i <=5; i++) {
//            for(int j=1;j<=5-i+1;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    }
}