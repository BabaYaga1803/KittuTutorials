package com.java.exceptionhandling.tutorial;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureIsDoneExampleTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException  {
		
		try {
			ExecutorService es = Executors.newSingleThreadExecutor();
			long startTime = System.nanoTime();
			
			Future<String> fts = es.submit(() -> {
			Thread.sleep(5000);
			System.out.println("here is the callable**************");
			return"The best object come out*******";
			});

					
			System.out.println("entering the isDone logic***********");
			while(! fts.isDone()) {
				if(!fts.isCancelled()) {
					System.out.println("Task completed! Retrieving the result");
				    String result2 = fts.get(1, TimeUnit.SECONDS);
				    System.out.println(result2);
				}
				else {
				    System.out.println("Task was cancelled");
				}
				
				Thread.sleep(200);
				System.out.println("Task is not done yet**************");
				
			double elapsedTimeInSec = ((System.nanoTime() - startTime))/ 1000000000.0;
			
			if(elapsedTimeInSec > 1) {
				fts.cancel(true);
				//System.out.println("Here is the logic***********"+result);
			}
				
			}
				System.out.println("Task done **************");
				
			String result = fts.get();
			System.out.println("Heres is the response****************"+result);
			
//			if(!fts.isCancelled()) {
//			    System.out.println("Task completed! Retrieving the result");
//			    String result2 = fts.get();
//			    System.out.println(result2);
//			} else {
//			    System.out.println("Task was cancelled");
//			}
//			
			es.isShutdown();

//		//starting workting with es response from executor
//		catch(InterruptedByTimeoutException e) {
//			System.out.println("The exception has been caught"  + e);
//			throw(e);
//	
//		}
			
		} catch (InterruptedException e) {
			System.out.println("Exception has been handled**********" + e);
			e.printStackTrace();
		}
	}
}
