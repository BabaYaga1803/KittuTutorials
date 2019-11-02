package com.java.exceptionhandling.tutorial;

import java.util.concurrent.*;

public class FutureAndCallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newSingleThreadExecutor();
		//first go with callable statement
		Callable<String> callable = () ->{
			System.out.println("Entered callable statement********");
			Thread.sleep(5000);
			return "Return the callable result";
		};
		//ExecutorService es = new Executors.newSingleThreadExecutor();
		System.out.println("Entering the Executor service now for submit method and future service********");
		
		Future<String> fts = es.submit(callable);
		System.out.println("entering the Future Service, Do something before callable executes the return value*********");	
		
		String result = fts.get();
		System.out.println("Hello am the callable sttmnt am here take a look***********" + result);
		es.isShutdown();
		
	}

}
