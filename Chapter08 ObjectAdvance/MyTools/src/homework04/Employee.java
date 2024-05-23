package homework04;

public class Employee {
	private String name;
	private double wage;
	private int days;
	private double level;
	private double salary;

	public Employee(String name, double wage, int days, double level) {
		super();
		this.name = name;
		this.wage = wage;
		this.days = days;
		this.level = level;
		this.salary = this.wage * this.days;
	}
	public double getLevel() {
		return level;
	}
	
	public void setLevel(double level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void printsal() {
		System.out.println("name:" + this.name + "\tannual salary is:" + this.salary);
	}
}
