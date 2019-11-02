package com.java.generics.tutorial;

import java.sql.Array;
import java.util.ArrayList;

public class BoundClass<T extends A>{
	private T objRef;
	
	BoundClass(T obj){
		this.objRef = obj;
	}
	public void doRunTest() {
		//first mistake
		//System.out.println("The test is running successfully");
		//((A) this.objRef).display();
		this.objRef.display();
	}
	
}

class A{
	//This is the class A :P
	int i = 10;
	String s = "Kittu";
	//Array[4] a = new Array[1,2,3,4,5];
	//ArrayList<String> al = new ArrayList<String>();
	//al.
	
	public void display() {
		i = i + 10;
		System.out.println("The class A is running successfully");
		System.out.println("The class A is running successfully******" + i);
		System.out.println("The class A is running successfully******" + s.charAt(1));
		System.out.println("The class A is running successfully******" + s.hashCode());
		System.out.println("The class A is running successfully******" + s.length());
	}
	
}

class B extends A{
	//This is the class B :P
	int k = 11;
	String t = "Teja";
	public void display() {
		k = k + 11;
		if(!(k == 11)) {
			System.out.println("Allow this ********");
		}
		else {
			System.out.println("Dislay this  ********");
		}
		System.out.println("The class B is running successfully");
		System.out.println("The class B is running successfully*******" + k);
		System.out.println("The class B is running successfully*******" + t.concat(s));
		System.out.println("The class B is running successfully*******" + t.toUpperCase());
	}
	
}

class C extends A{
	//This is the class C :P
	int j = 12;
	public void display() {
		j = j + 12;
		System.out.println("The class C is running successfully");
		System.out.println("The class C is running successfully*******" + j);
	}
	
}