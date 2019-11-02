package com.java.collections.tutorial;

import java.util.*;

public class HashSetSimpleOperationsExample {

	public static void main(String[] args) {
		Set<String> popularCities = new HashSet<>();
		System.out.println("RTo check wheather the popularCities id empty or not...." +popularCities.isEmpty());
		popularCities.add("Hyd");
		popularCities.add("Banglore");
		popularCities.add("Chennai");
		System.out.println("These are the popular cities....."+ popularCities.size());
		System.out.println("These are the popular cities....."+ popularCities);
		String isCityPresent = "Hyd";
		if(popularCities.contains(isCityPresent)) {
			System.out.println(isCityPresent+ ".............Yes the popular city id present");
		}	
			else { 
				System.out.println(isCityPresent+ "............Not the popular city id present");
			}	
		
	}

}
