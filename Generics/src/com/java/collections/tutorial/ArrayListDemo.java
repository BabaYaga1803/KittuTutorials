package com.java.collections.tutorial;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main (String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Anil");
		a1.add("Katta");
		
		//Difference for doing Iterator process
		//ArrayList Implements List Interface which indeed extends the collection Interface
		System.out.println(a1);
		Iterator it = a1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
	}

}
