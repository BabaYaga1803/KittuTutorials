package com.java.collections.tutorial;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//LinkedHashMap with Lambda expressions java 8
public class IterateOverLinkedHashMapExample {
//	String user;
//	String city;

	public static void main(String[] args) {
		LinkedHashMap<String,String> citymapping = new LinkedHashMap<>();
		citymapping.put("Anurag", "Richmond");
		citymapping.put("Anil", "Denver");
		citymapping.put("Sai", "Desmoines");
		citymapping.put("Harsha", "Charlotte");
		
		citymapping.forEach((user,city) -> {
			System.out.println("The first Lambda expr........."+user +"->" +city);
		});
		Iterator<Entry<String, String>> itr = citymapping.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println("Iterator applied....." + itr.next());
		}
		itr = citymapping.entrySet().iterator();
		itr.forEachRemaining(entry->{
			System.out.println("The remaining for each loop......" +entry.getKey() + "--->" + entry.getValue());
		});
	}
	//Iterator itr = citymapping.

}
