package FirrstJava;

import java.util.Scanner;

public class fibboPro {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int number  = input.nextInt();
        int a= 0;
        int b=1;
        int count=2;
        while(count<=number){
            int temp = b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b+" ");
    }
}