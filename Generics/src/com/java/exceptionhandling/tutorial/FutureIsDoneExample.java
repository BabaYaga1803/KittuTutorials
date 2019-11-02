//package com.java.exceptionhandling.tutorial;
//
//import java.nio.channels.InterruptedByTimeoutException;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.Executor;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
//
//public class FutureIsDoneExample {
//
//	public static void main(String[] args) throws InterruptedException, ExecutionException  {
//		
//		ExecutorService es = Executors.newSingleThreadExecutor();
//		long startTime = System.nanoTime();
//		
//		try {
//		Future<String> fts = es.submit(() -> {
//		Thread.sleep(5000);
//		System.out.println("here is the callable**************");
//		return"The best object come out*******";
//		});
//
//				
//		System.out.println("entering the isDone logic***********");
//		while(! fts.isDone()) {
//			Thread.sleep(200);
//			System.out.println("Task is not done yet**************");
//			
//		double elapsedTimeInSec = ((System.nanoTime() - startTime))/ 1000000000.0;
//		
//		if(elapsedTimeInSec > 1) {
//			fts.cancel(true);
//			//System.out.println("Here is the logic***********"+result);
//		}
//			
//		}
//			System.out.println("Task done **************");
//			
//		String result = fts.get();
//		System.out.println("Heres is the response****************"+result);
//		es.isShutdown();
//	}
//	
//		catch(InterruptedByTimeoutException ie) {
//			System.out.println("The exception has been caught"  + ie);
//			throw(ie);
//	
//		}
//	}
//}
