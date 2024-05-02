package com.poly_.polypara_;

public class Testing {
	private double annual;
	private Employee e;

	public Testing(Employee e) {
		super();
		this.e = e;
		this.annual = this.e.getAnnual();
	}

	public double getAnnual() {
		return annual;
	}

	public void setAnnual(double annual) {
		this.annual = annual;
	}

	public void testWork(Employee e) {
		if (e instanceof stuff) {
			((stuff) e).work();
		} else if (e instanceof manager) {
			((manager) e).manage();
		}
	}
}
