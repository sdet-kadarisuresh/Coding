package com.coding;

import java.util.Scanner;

public class GreatestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int maxDigit = 0;
        int digit;

        num = Math.abs(num);

        while (num != 0) {
            digit = num % 10;      
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            num = num / 10;        
        }

        System.out.println("Greatest digit is: " + maxDigit);
    }
}
