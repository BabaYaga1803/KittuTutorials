package com.java.generics.tutorial;

//so in the lowerbound generics process the method will allow the supertype of the data type
//its syntax is for example (List<? super Integer> list) it works with keyword super and its method will
//allow the supertype of the data type as mentioned in the syntax  

import java.util.Arrays;
import java.util.List;

public class WildCardDemo2 {
	public static void main (String[] args){
		List<Integer> list1 = Arrays.asList(4,5,6,7);
		printOnlyIntegers(list1);
		List<Integer> list2 = Arrays.asList(4,6,8,10);
		printOnlyIntegers(list2);
		
	}
	public static void printOnlyIntegers(List<? super Integer> lists) {
		System.out.println("The LowBound Generics" + lists);
			
	}
}


