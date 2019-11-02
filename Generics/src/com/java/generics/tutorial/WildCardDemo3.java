package com.java.generics.tutorial;

//outbound generics process allows all type of data types and returns it.

import java.util.Arrays;
import java.util.List;

public class WildCardDemo3 {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1,2,4,5,8,43,6,78,2);
		List<Double> l2 = Arrays.asList(1.0,2.0,4.0,5.0);
		List<String> l3 = Arrays.asList("Kittu", "Chary");
		printAnyDataType(l1);
		printAnyDataType(l2);
		printAnyDataType(l3);
	}
	public static void printAnyDataType(List<?> list) {
		System.out.println(list);
	}

}
