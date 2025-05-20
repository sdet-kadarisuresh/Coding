package com.coding;

public class ShiftZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 0, 1, 9};

        int n = arr.length;
        int index = 0; 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while (index < n) {
            arr[index] = 0;
            index++;
        }

        System.out.print("Array after shifting zeros to end: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
