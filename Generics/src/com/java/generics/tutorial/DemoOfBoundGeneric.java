package com.java.generics.tutorial;

public class DemoOfBoundGeneric {
	public static void main(String[] args) {
		BoundClass<C> bc = new BoundClass<C>(new C());
		bc.doRunTest();
		
		BoundClass<B> bb = new BoundClass<B>(new B());
		bb.doRunTest();
		
		BoundClass<A> ba = new BoundClass<A>(new A());
		ba.doRunTest();
		
		//BoundClass<String> bs = new BoundClass<String>(new String());
		//bs.doRunTest();
	}

}
