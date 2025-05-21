package com.coding;

public class MergeArraysRemoveDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 5, 6, 7};

        int totalLength = arr1.length + arr2.length;
        int[] merged = new int[totalLength];

        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[k++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[k++] = arr2[i];
        }

        System.out.print("Merged array without duplicates: ");
        for (int i = 0; i < totalLength; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (merged[i] == merged[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(merged[i] + " ");
            }
        }
    }
}
