package com.java.generics.tutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BasicGenericsConcept {
	public static void main (String[] args) {
		List<String> list = new ArrayList();
		list.add("Kittu");
		list.add("Sai");
		list.add("Anil");
		
		System.out.println("Displaying the list ......" +list);
		String s = list.get(1);
		System.out.println("After Using ther Generics..............." +s);
		Iterator<String> itr =  list.iterator();
		while(itr.hasNext()){
		System.out.println("With the Iterator class............" +itr.next());
		}
		
	}

}
