package com.java.exceptionhandling.tutorial;

public class SimpleException {

	public static void main(String[] args) {
		try {
			try {
				int b = 50 / 0;
				System.out.println("The integer wants to divide*****************");
			} catch (ArithmeticException ae) {
				System.out.println("ArithmeticException Exception Handled*****************");
			}
			try {
				int a[] = new int[5];
				a[5] = 6;
				System.out.println("The integer a[] wants to push the number but no size*****************");
			} catch (ArrayIndexOutOfBoundsException ab) {
				System.out.println("ArrayIndexOutOfBoundsException Exception Handled*****************");
			}
		} catch (Exception e) {

		}

	}

}
