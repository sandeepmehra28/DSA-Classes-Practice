package Exam_Prep;

import java.util.Scanner;

public class Rectangle {
    // Attributes
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Getters (optional)
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


     static void main() {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Create Rectangle object
        Rectangle rect = new Rectangle(length, width);

        // Output results
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());

        scanner.close();
    }
}
