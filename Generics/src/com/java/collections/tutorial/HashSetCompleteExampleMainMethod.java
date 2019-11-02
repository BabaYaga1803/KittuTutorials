package com.java.collections.tutorial;

import java.util.HashSet;
import java.util.Set;

public class HashSetCompleteExampleMainMethod {

	public static void main(String[] args) {
		Set<HashSetCompleteExample> customer = new HashSet();
		customer.add(new HashSetCompleteExample(1,"Sai"));
		customer.add(new HashSetCompleteExample(2,"Anil"));
		customer.add(new HashSetCompleteExample(3,"Cherry"));
		System.out.println("Here is the magic of HasSet.......... "+customer);

	}

}
