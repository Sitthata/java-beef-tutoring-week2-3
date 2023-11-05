package org.example.arrayFundamental;

import java.util.Arrays;

public class PracticeArray {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 10, 24, 51, 14, 22, 67, 89, 91};
        System.out.println(max(numbers));
    }

    public static int arraySum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // maxFinder(int[] numbers)
    public static int max(int[] array) {
        int[] sortedArray = Arrays.stream(array).sorted().toArray();
        // sort the array in ascending order
        System.out.println(Arrays.toString(sortedArray));
        // return the last element of the array
        return sortedArray[sortedArray.length - 1];
    }

    // average(int[] numbers)
    public static double average(int[] array) {
        // We can use the arraySum method to calculate the sum of the array
        int total = arraySum(array);
        return (double) total / array.length;
    }
}
