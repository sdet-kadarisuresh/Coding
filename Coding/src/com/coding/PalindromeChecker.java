package com.coding;

import java.util.Scanner;

public class PalindromeChecker {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        
	        int reverse = 0;
	        int temp=num;

	        while (num>0) {
	            int digit = num % 10;      
	            reverse = reverse*10 + digit; 
	            num = num/10;       
	        }

	        if(reverse==temp)  {
	            System.out.println(reverse + " is a Palindrome.");
	        } else {
	            System.out.println(reverse + " is NOT a Palindrome.");
	        }
	        sc.close();
	    }
	}