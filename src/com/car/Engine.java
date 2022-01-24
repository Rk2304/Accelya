package com.car;

public class Engine {
	int chasisNumber;

	public Engine(int chasisNumber) {
		super();
		this.chasisNumber = chasisNumber;
	}

	@Override
	public String toString() {
		return "" + chasisNumber;
	}

}
