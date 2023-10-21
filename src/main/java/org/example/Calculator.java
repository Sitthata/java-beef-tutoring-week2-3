package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Call your method here
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose first number");
        int number1 = scanner.nextInt();
        System.out.println("number first is " + number1);
        // Enter second number
        System.out.println("choose second number");
        int number2 = scanner.nextInt();
        System.out.println("number second is " + number2);
        System.out.println("choose operation");
        String operater = scanner.next();
    }

    // 10, 20, +
    // calculate(10,20,+) 30
    // calculate(20,10,-) 10
    // calculate(5,0,/) -1

    public static double calculate(int number1, int number2, String operater) {
        switch (operater) {
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
                    return (double)number1 / number2;
                }

            default:
                return -2 ;
        }

    }

}
