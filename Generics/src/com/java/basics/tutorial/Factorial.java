package com.java.basics.tutorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number here..............");
		int n = sc.nextInt();
		int f = 1;
		for(int i = n; i >= 1; i--) 
		 //int f = 1;
		 f = f * i;
		 System.out.println("The entered number factorial result is......." + f);
		
		
	}

}
