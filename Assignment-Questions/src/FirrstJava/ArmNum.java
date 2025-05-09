package FirrstJava;

import java.util.Scanner;

public class ArmNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowerLimit = input.nextInt();
        int upperLimit = input.nextInt();
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }
    static boolean isArmstrongNumber(int number){
        int originalNumber = number;
        int numberOfDigits = (int) Math.log10(number) + 1;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        return sum == originalNumber;
    }
}