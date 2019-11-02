package com.java.multithreading.tutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.w3c.dom.css.Counter;
//Need to understand in depth .............
public class RaceConditionExample {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(15);
		Counter counter = new Counter() {
			
			@Override
			public String getSeparator() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getListStyle() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getIdentifier() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		//Counter count = (Counter) new RaceConditionExample();
		for(int i = 0; i <= 1000; i++) {
			es.submit(() -> counter.hashCode());
			es.isShutdown();
			es.awaitTermination(60, TimeUnit.SECONDS);
			System.out.println("Here is the result" +counter.hashCode());
			
			
		}

	}

}
