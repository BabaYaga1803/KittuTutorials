package com.java.generics.tutorial;

 //upperbound wild card process where the restrictions on the variables will be relaxed.
//eg: List<Integer>, List<Double>, List><String> a variable can be of any type the upperbound method will take care of with
//syntax of List<? extends Numbers> list

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {
	public static void main (String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		System.out.println("The first list........." +sum(list1));
		List<Double> list2 = Arrays.asList(1.0,2.0,3.0,4.0);
		System.out.println("The first list........." +sum(list2));
	}
		
		 public static double sum(List<? extends Number> list)  
		    { 
		        double sum1=0.0; 
		        for (Number i: list) 
		        { 
		            sum1+=i.doubleValue(); 
		        } 
		  
		        return sum1; 
		    } 
		
	}


