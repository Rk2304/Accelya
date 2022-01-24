package com.car;

public class Car {
	String name;
	int number;
	Driver driver;
	Engine engine;

	public Car(String name, int number, Driver driver, Engine engine) {
		super();
		this.name = name;
		this.number = number;
		this.driver = driver;
		this.engine = engine;
	}

	public Car(String name, int number, Engine engine) {
		super();
		this.name = name;
		this.number = number;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", number=" + number + ", driver=" + driver + ", ChasisNumber=" + engine + "]";
	}
	
	

}
