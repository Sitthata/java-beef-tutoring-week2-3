package org.example;

public class Main {
    public static void main(String[] args) {
        // Call your method here
        // use variable
        String hello = stringGreet("Beef");
        System.out.println(hello);
        System.out.println(stringGreet("First"));
        int width = 10;
        int height = 5;
        int rectangleArea = calculateRectangleArea(width, height);
        int r = 5;
        double circleArea1 = Math.PI * Math.pow(r, 2);
        double circleArea2 = calculateCircleArea(r);

    }

    static void greet() {
        System.out.println("Hello");
    }

    public static String stringGreet(String name) {
        return "Hello " + name;
    }

    // plusFive
    public int plusFive(int num) {
        return num + 5;
    }

    // calculateRectangleArea
    public static int calculateRectangleArea(int width, int length) {
        return width * length;
    }

    // calculateCircleArea
    public static double calculateCircleArea(int radius) {
        return Math.PI * radius * radius;
    }
}