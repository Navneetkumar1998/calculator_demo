package com.calculator;

import java.util.Scanner;

public class MyCalculator {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Available operations:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Select an operation (1/2/3/4): ");

        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = performOperation(choice, num1, num2);

        if (Double.isNaN(result)) {
            System.out.println("Error: Invalid operation or division by zero!");
        } else {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    public static double performOperation(int choice, double num1, double num2) {
        double result = 0.0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;

            default:
                result = Double.NaN; // Represents an invalid result
        }

        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }


}
