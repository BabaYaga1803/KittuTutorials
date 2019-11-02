package com.java.collections.tutorial;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Gullu");
		l1.add("Abhijeeth");
		l1.add("Lingampally");
		System.out.println("Before Iteration the linked list is ........." + l1);
		
		Iterator i1 = l1.iterator();
		while(i1.hasNext()) {
			System.out.println("After the Iteration process the linked list is ......" + i1.next());
		}
	}

}
