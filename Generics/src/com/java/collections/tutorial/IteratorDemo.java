package com.java.collections.tutorial;

// Crazy Iterator need to learn more and code practice.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c","d"));
		Iterator<String> i1 = list1.iterator();
		while(i1.hasNext()) {
			System.out.println("The first list....." +i1.next());
		}
		List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
		Iterator<Integer> i2 = list2.iterator();
		Iterator<Integer> i3 = list2.iterator();
		for(;i2.hasNext();){
			if(i2.next().equals(5)) {
				//System.out.println("The i2 iteration for loop and its logic...."+i2.next());
				i2.remove();
				break;
				//System.out.println("The i2 iteration for loop and its logic...."+i2.next());
			}
			
		}
//		for(;i3.hasNext();){
//			if(i3.next().equals(6)) {
//				//System.out.println("The i2 iteration for loop and its logic...."+i3.next());
//				i3.remove();
//				//System.out.println("The i2 iteration for loop and its logic...."+i3.next());
//			}
//			
//		}
	}

}
