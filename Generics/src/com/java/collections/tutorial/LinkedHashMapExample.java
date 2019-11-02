package com.java.collections.tutorial;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//Map doesn't give a predictable order in the console where as LinkedHashMap give the predictable order for user

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> L1 = new LinkedHashMap<>();
		//Map<Integer,String> L1 = new HashMap<>();
		L1.put(1, "Anil");
		L1.put(2, "Sai");
		L1.put(3, "Gullu");
		L1.put(4, "Pam");
		L1.putIfAbsent(5, "Mannu");
		System.out.println("Magic of LinkedHashMap.........."+L1);
		//Replacing the new value with the old one ;)
		L1.replace(4, "Pam", "Anurag");
		System.out.println("The new LHMP............"+L1);	
		L1.clone();
		System.out.println("The new LHMP............"+L1);	
		if(L1.containsValue("Anurag")) {
			System.out.println("Anurag" + ".............Yes the obj is present");
		}	
			else { 
				System.out.println("Anurag" + "............Not the obj is present");
			}	
//		L1.containsKey(3);
//		System.out.println("The new Contains LHMP............"+L1);	
		L1.equals("Anurag");
		System.out.println("The new equals obj of LHMP............"+L1);
		L1.entrySet();
		System.out.println("The new LHMP............"+L1.get(2));
		L1.isEmpty();
		System.out.println("To check empty LHMP............"+L1.get(1));
		
		String L2 = L1.remove(5);
		System.out.println("The new Contains LHMP for L2............"+L1);	
		boolean isRemoved = L1.remove(5, "Mannu");
		System.out.println("Its a null check with true or false hierarchy......"+isRemoved);
		
		
		
		
		
		
	}

}
