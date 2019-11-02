package com.java.generics.tutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericsForHashMap {
	public static void main (String[] args) {
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(0, "Kittu");
		m.put(1, "Tharun");
		m.put(2, "Anurag");
		m.put(3, "Anil");
		System.out.println("The Hashmap is here........." +m);
		
		//sort with Iterator
		//Set<Map.Entry<Integer, String>> set = Map.entrySet();
		Set<Map.Entry<Integer,String>> set=m.entrySet(); 
		Iterator <Map.Entry<Integer,String>> itr = set.iterator();
		while(itr.hasNext()) {
			//m.entrySet() x = itr.next();
		System.out.println("after the iteration of method.............." +itr.next());
		}
		
	}

}
