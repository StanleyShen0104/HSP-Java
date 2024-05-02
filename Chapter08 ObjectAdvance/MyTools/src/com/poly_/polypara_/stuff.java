package com.poly_.polypara_;

public class stuff extends Employee {
	public stuff(String name, double salary) {
		super(name, salary);
	}

	public void work() {
		System.out.println("stuff " + super.getName() + " is working");
	}

	@Override
	public double getAnnual() {
		// TODO Auto-generated method stub
		return super.getAnnual();
	}
}
