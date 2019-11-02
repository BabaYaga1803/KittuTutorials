package com.java.collections.tutorial;

import java.util.Iterator;
import java.util.PriorityQueue;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Prashanth");
		queue.add("Tharun");
		queue.add("Dabba");
		queue.add("Suman");
		System.out.println("The Initial queue......" +queue);
		System.out.println("The Head object......" +queue.element());
		System.out.println("The Head object......" +queue.peek());
		queue.remove();
		queue.poll();
		
		//Using Iterator
		Iterator i1 = queue.iterator();
		while(i1.hasNext()) {
			System.out.println("With the iteration process......" +i1.next());

		}
	}

}
