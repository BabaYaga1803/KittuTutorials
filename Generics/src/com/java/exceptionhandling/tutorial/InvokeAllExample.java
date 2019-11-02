package com.java.exceptionhandling.tutorial;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		ExecutorService es = Executors.newFixedThreadPool(6);
		
//		Callable <String> task1 = -> (){
//			Thread.sleep(2000);
//			return "I'm the first thread buddy";
//		};
		
		Callable<String> task1 = () ->{
			System.out.println("Task1 Completed********");
			Thread.sleep(2000);
			return "Return the callable result";
		};
		Callable<String> task2 = () ->{
			System.out.println("Task2 Completed********");
			Thread.sleep(4000);
			return "Return the callable result";
		};
		Callable<String> task3 = () ->{
			System.out.println("Task3 Completed********");
			Thread.sleep(6000);
			return "Return the callable result";
		};
		//List<Callable<String>> List1 = new  Arrays.asList(task1,task2,task3);
		 List<Callable<String>> taskList = Arrays.asList(task1, task2, task3);
		 List<Future<String>> futures = es.invokeAll(taskList);
		 
		// System.out.println("Here is the magic*********************boooom"+ futures);
		 
//		 for(Future<String> future: futures) {
//			 
//		 }
		 for(Future<String> future : futures){ 
				 System.out.println(/*"Here is the magic*********************boooom"+ */future.get());
			 
		 }
		es.isTerminated();
	}

}
