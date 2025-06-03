package Basic_Questions;

public class Patterns {
    public static void main(String[] args) {
        p8(5);
    }
    static void p1(int n){
        for (int i = 0;i<=n;i++){
            for(int j = 5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p2(int n){
        int space = n-1,st = 1;
        for (int i =1; i <= n; i++) {
           // System.out.print(space+" "+st);
            for (int j = 1; j <=space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++    ) {
                System.out.print("*");
            }
            space--;
            st++;
            System.out.println();
        }

    }
    static void p3(int n){
        //     *
        //   * * *
        // * * * * *
        //   * * *
        //     *
        int sp  = n/2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
//            System.out.print(sp+" "+st);
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("* ");
            }
            if(i<=n/2){
                sp--;
                st+=2;
            }else{
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }
    static void p4(int n){
        int sp  = 1;
        int st = n/2+1;
        for (int i = 1; i <= n; i++) {
//             System.out.println(st+" "+sp+" "+ st);
            for (int j = 1; j <=st ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=sp ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=st ; j++) {
                System.out.print("*");
            }
            if(i<=n/2){
                st--;
                sp+=2;
            }else{
                st++;
                sp-=2;
            }
            System.out.println();
        }
      // *** ***
     //  **   **
     //  *     *
//       **   **
//       *** ***

    }
    static void p5(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j){
                    System.out.print("*");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void p6(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i+j==n+1){
                    System.out.print("*");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void p7(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i+j==n+1||i==j){
                    System.out.print("*");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void p8(int n){
        int os = n/2;
        int is = -1;
        for (int i = 1; i <=n; i++) {
            for(int j =1;j<=os;j++){
                System.out.print("\t");
            }
            System.out.print("* ");
            for (int j = 1; j <=is; j++) {
                System.out.print("\t");
            }
            if(i>1&&i<n){
                System.out.print("* ");
            }
            if(i<=n/2){
                os--;
                is+=2;
            }else{
                os++;
                is-=2;
            }
            System.out.println();
        }
    }
}
