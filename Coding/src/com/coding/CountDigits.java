package com.coding;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int original = num;

        if (num == 0) {
            count = 1; // 0 has one digit
        } else {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        }

        System.out.println("Number of digits in " + original + " is: " + count);
    }
}
