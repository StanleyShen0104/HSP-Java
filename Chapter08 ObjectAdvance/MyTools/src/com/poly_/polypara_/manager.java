package com.poly_.polypara_;

public class manager extends Employee {
	private double bonus;

	public manager(String name, double salary, double bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double getAnnual() {
		// TODO Auto-generated method stub
		return super.getAnnual() + bonus;
	}

	public void manage() {
		System.out.println("manager " + super.getName() + " is managing");
	}

}
