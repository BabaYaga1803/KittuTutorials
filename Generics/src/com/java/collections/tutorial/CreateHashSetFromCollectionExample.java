package com.java.collections.tutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollectionExample {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList();	
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List<Integer> s1 = new ArrayList();	
		s1.add(4);
		s1.add(5);
		s1.add(6);
		Set<Integer> x = new HashSet<>(l1);
		x.addAll(s1);
		System.out.println("Come on budyyyyyyyy.........." + x);
		
	}

}
