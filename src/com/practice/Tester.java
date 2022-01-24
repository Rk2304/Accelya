package com.practice;

public class Tester {
	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		 emp[0] = new Employee(2, "sam", 6000,new Address("Plot no.18","Ganesh colony",425001));
		 emp[1] = new Employee(3, "priya", 7000, new Address("Plot no.19","Ganesh colony",425001));
		
		for(Employee i:emp) {
			System.out.println(i);
		}
	}
}
