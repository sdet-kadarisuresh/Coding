package com.coding;

public class BiggestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {25, 497, 378, 89, 194, 67, 989, 45};

        int biggest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggest) {
                biggest = numbers[i];
            }
        }

        System.out.println("The biggest number in the array is: " + biggest);
    }
}
