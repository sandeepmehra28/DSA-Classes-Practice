package Exam_Prep;

import java.util.Scanner;
// Q: Create a Java program that prompts the user to enter two integers.
//    Then, determine whether both numbers are even, odd, or mixed
//    (one even and one odd) using logical operators.
public class even_odd_mixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user input
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Check even/odd using logical operators
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both numbers are even.");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both numbers are odd.");
        } else {
            System.out.println("The numbers are mixed (one even, one odd).");
        }

        scanner.close();
    }
}
