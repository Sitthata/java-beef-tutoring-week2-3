package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Call your method here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.print("choose operation (+, -, *, /): ");
        String operator = scanner.next();
        double result = calculate(number1, number2, operator);
        System.out.printf("%d %s %d = %f", number1, operator, number2, result);
    }

    public static double calculate(int number1, int number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    return -1;
                } else {
                    return (double) number1 / number2;
                }
            default:
                return -2;
        }
    }

}
