package com.java.multithreading.tutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class SyncronizedCount{
	 private int count = 0;
	 
	 public synchronized void increment(){
		 count = count + 1;
	 }
	 public int getCount() {
		  return count;
	 }	
}


public class SynchronizedMethodExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(10);
		SyncronizedCount sc = new SyncronizedCount();
		for(int i = 0; i < 1000; i++) {
			es.submit(() -> {
				sc.increment();
			});
		}
		es.awaitTermination(5000, TimeUnit.MILLISECONDS);
		es.isShutdown();
		System.out.println("The thread occurs in correct manner*****" + sc.getCount());

	}

}
//class SyncronizedCount {
//	 int count = 0;
//	 
//	 public synchronized void increment(){
//		 count = count + 1;
//	 }
//	 public int getCount() {
//		  return count;
//	 }	
//}
//}