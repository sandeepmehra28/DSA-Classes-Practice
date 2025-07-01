package Exam_Prep;

import java.util.Scanner;
// Q : Write a Java program that calculates and prints the maximum of three numbers
//     entered by the user using the conditional (ternary) operator.
public class Maximum_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum using nested ternary operators
        int max = (num1 > num2)
                ? (num1 > num3 ? num1 : num3)
                : (num2 > num3 ? num2 : num3);

        // Display the result
        System.out.println("The maximum number is: " + max);

        scanner.close();
    }
}
