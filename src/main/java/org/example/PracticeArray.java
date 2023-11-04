package org.example;

import java.util.Arrays;

public class PracticeArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 10, 24, 51, 14, 22, 67, 89, 91};
        // Call your method here
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    // maxFinder(int[] numbers)

    // average(int[] numbers)
}
