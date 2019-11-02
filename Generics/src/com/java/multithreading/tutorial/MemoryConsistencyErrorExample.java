package com.java.multithreading.tutorial;

public class MemoryConsistencyErrorExample {
	public static boolean sayHello = false;

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			while(!sayHello) {
				
			}
			System.out.println("Print Hello***********");
			while(sayHello) {
				
			}
			System.out.println("Print Bye Bye***********");
		}); 
		thread.start();
		
		Thread.sleep(1500);
		System.out.println("Print hi");
		sayHello = true;
		
		Thread.sleep(2500);
		System.out.println("Print Bye");
		sayHello = false;

	}

}
