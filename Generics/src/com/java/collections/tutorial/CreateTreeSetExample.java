package com.java.collections.tutorial;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSetExample {

	public static void main(String[] args) {
		//SortedSet<String> fruits = new TreeSet<>();
		//SortedSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		//Internally the Comparator which is an interface will have compareTo() method. 
		SortedSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());
		//Just for understanding purpose what Comparator can do
		/*
        The above TreeSet with the custom Comparator is the concise form of the following:
        SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
    */
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		System.out.println("Displaying the fruitssss" +fruits);
		//Duplicates can't be added
		fruits.add("Apple");
		//case sensitive can be added
		//After calling String.CASE_INSENSITIVE_ORDER this in the TreeSet the case sensitivity is checked and will
		//will not be displayed in the console.
		fruits.add("banana");
		System.out.println("Displaying the fruitssss" +fruits);
		System.out.println("Displaying the fruitssss.........." +fruits.size());
		//yet to define what it is.........
		System.out.println("Displaying the fruitssss" +fruits.headSet("banana"));
	}

}
