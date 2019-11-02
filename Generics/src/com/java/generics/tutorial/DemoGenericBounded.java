//package com.java.generics.tutorial;
//
//public class DemoGenericBounded <T extends A & B>{
//	
//	private T objRef;
//	
//	DemoGenericBounded(T obj){
//		this.objRef = obj;
//	}
//	public void displayRun(){
//		this.objRef.displayThis();
//	}
//}
//
//	interface B{
//		public void displayThis();
//		
//		
//	}
//	class A implements B{
//
//		@Override
//		public void displayThis(){
//			// Class that implements the interface becomes super class
//			System.out.println("Inside the super class A*********");
//		}
//
//		
//	}
