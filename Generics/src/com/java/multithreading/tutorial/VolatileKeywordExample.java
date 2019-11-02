package com.java.multithreading.tutorial;

public class VolatileKeywordExample {
	private static volatile boolean sayHello;

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			// System.out.println("The Thread has been initiated and its out of memory
			// err********");

			while (!sayHello) {

			}
			System.out.println("Say Hello world");

			while (sayHello) {

			}
			System.out.println("Don't Say Anything");
		});
		thread.start();

		Thread.sleep(1000);
		System.out.println("The Thread will initiate*****");
		sayHello = true;

		Thread.sleep(5000);
		System.out.println("The Thread will initiate*****");
		sayHello = false;

	}

}
