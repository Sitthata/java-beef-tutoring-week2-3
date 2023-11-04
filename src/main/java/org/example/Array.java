package org.example;

public class Array {
    public static void main(String[] args) {
        // Array Declaration
        // predefined
        // length = 5
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Subaru"};
        int[] numbers = {1, 2, 3, 4, 5};

        // empty
        String[] pets = new String[5];
        int[] ages = new int[5];

        // What if we print empty array?
        for (int i = 0; i < pets.length; i++) {
            System.out.println(pets[i]);
        }

        // Assign values
        pets[0] = "Cat";
//        pets[1] = "Dog";
        // What is the length of pets array?
    }
}
