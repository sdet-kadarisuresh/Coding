package com.coding;
import java.util.*;
import java.math.BigInteger;

public class FactorialCalculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//long fact=1;
		BigInteger f=BigInteger.ONE;
		for(int i=1;i<=n;i++) {
			
			f=f.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("Factorial Of "+n+" is "+f);
		
		
	}

}
