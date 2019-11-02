package com.java.encapsulation.tutorial;

import java.util.ArrayList;
import java.util.HashMap;

public class BankAccount {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		
		emp.setAge(30);
		emp.setFirstName("Narsimulu");
		emp.setLastName("something");
		emp.setEmpId(007);
		emp.setSalary(250000.00f);
		
		emp1.setAge(25);
		emp1.setFirstName("Rajini Kanth");
		emp1.setLastName("Gaekwadd");
		emp1.setEmpId(1);
		emp1.setSalary(50000.00f);
		System.out.println("The employee....... " + emp1 );
		
		ArrayList<Employee> ae1 = new ArrayList<Employee>();
		ae1.add(emp);
		System.out.println("The employee....... " + ae1 );
		
		HashMap<Integer,String> he = new HashMap<>();
		he.put(1, "emp");
		he.put(2, "emp1");
		
		System.out.println("The employee is in the HashMap......." + he);
	}

}
