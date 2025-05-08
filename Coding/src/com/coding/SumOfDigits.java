package com.coding;
import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = num; 
        int sum = 0;
        
        while (num != 0) {
            int d = num % 10; 
            sum += d;         
            num = num / 10;       
        }

        System.out.println("Sum of digits of " + res + " is: " + sum);
        sc.close();
    }
}
