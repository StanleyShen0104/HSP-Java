package com.object;

public class Finalize {
	public static void main(String[] args) {
		Car c = new Car("BMW");
		c = null;
		System.gc();
	}
}

class Car {
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(this.name +" is already been abandoned");
		super.finalize();
	}
	
}

