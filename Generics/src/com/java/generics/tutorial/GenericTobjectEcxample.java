package com.java.generics.tutorial;

public class GenericTobjectEcxample {

	public static void main(String[] args) {
		GenericClassTobj<Integer> g1 = new GenericClassTobj<Integer>();
		g1.add(10);
		System.out.println("This is the generic class for Integer type............"  +g1.get());
/*		GenericClassTobj<String> g2 = new GenericClassTobj<String>();
		g2.add1("Kittu");
		System.out.println("This is the generic class for String type............"  +g2.get1());*/
		
	}

}
