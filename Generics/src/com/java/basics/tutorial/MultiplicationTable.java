package com.java.basics.tutorial;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. to get the Mtable......  ");
		int n = sc.nextInt();
		for(int i = 1; i<= 20; ++i) {
			int p = n * i;
			System.out.println(n + " * " + i + " = " + p);
	
		}
	}	

}
