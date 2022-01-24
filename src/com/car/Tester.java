package com.car;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("Bugatti Veyron",7098,new Driver("Ram"),new Engine(100));
		Car c2=new Car("Mercedes Benz",7099,new Engine(200));
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
