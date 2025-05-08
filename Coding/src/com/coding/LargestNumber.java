package com.coding;
import java.util.Scanner;

//Q1. Write code to find the biggest of 3 numbers.
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println("Enter C value");
		int c=sc.nextInt();
		
		System.out.println("The Enter values is A="+a+" B="+b+" C="+c);
		
		if(a>b && a>c) {
			System.out.println("A is Largest number "+a);
		}
		else if(b>a && b>c) {
				System.out.println("B is Largest number "+b);

			}
		else if(c>a && c>b)
		{
			System.out.println("C is Largest number "+c);

		}
		else {
			System.out.println("Two or more numbers are equal and largest");

		}
		
		sc.close();

	}

}
