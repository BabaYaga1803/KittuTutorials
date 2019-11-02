package com.java.collections.tutorial;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCodeMain {

	public static void main(String[] args) {
		SortedSet<TreeSetCode> emp = new TreeSet<>();
		//I'm missing something
		emp.add(new TreeSetCode(101,"Chakri"));
		emp.add(new TreeSetCode(102,"Ritesh"));
		emp.add(new TreeSetCode(103,"Venky"));
		//emp.addAll(emp);
		System.out.println("The TreeSet result for TestCode......."+emp);
		emp = new TreeSet<>(Comparator.comparing(TreeSetCode :: getName));
		
		emp.add(new TreeSetCode(101,"Chakri"));
		emp.add(new TreeSetCode(102,"Ritesh"));
		emp.add(new TreeSetCode(103,"Achyuth"));
		
		System.out.println("The TreeSet result for TestCode......."+emp);
	}

}
