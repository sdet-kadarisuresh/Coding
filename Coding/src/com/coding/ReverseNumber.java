package com.coding;
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int res = num; 
        int reverse = 0;

        while (num>0) {
            int digit = num % 10;      
            reverse = reverse*10 + digit; 
            num = num/10;       
        }

        System.out.println("Reversed number of " + res + " is " + reverse);

        sc.close();
    }
}
