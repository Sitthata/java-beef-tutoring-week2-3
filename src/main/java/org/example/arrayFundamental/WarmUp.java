package org.example.arrayFundamental;

public class WarmUp {
    public static void main(String[] args) {
        // 1. create variable
        // 2. call your function
        double bmi = bmiCalculator(75,166);
        System.out.println(bmi);
    }

    // Create a BMI calculator (weight, height). BMI = weight / height^2
    // student score -> studentScore
    public static double bmiCalculator(int weight, int height) {
        return weight / Math.pow(height, 2);
    }
}

