package homework05;

public class Employee {
	private String type = "Employee";
	private double wage;
	private double annual;

	public Employee(double wage) {
		super();
		this.wage = wage;
		annual = 12 * this.wage;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public String getType() {
		return type;
	}

	public double getAnnual() {
		return annual;
	}

	public void setAnnual(double annual) {
		this.annual = annual;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String salary() {
		return this.type + " annual salary is " + this.annual;
	}
}
