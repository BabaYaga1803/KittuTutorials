package com.java.exceptionhandling.tutorial;

public class BasicException extends Exception {
	String str1;

	BasicException(String str2) {
		str1 = str2;
	}

	@Override
	public String toString() {
		return ("My Exception Occured********************" + str1);
	}

	static class Example1 {
		public static void main(String[] args) {
			try {
				System.out.println("Start try block********************");
				throw new BasicException("This is the error message********************");
			} catch (BasicException be) {
				System.out.println("catch block********************" + be);

			}
		}

	}
}
