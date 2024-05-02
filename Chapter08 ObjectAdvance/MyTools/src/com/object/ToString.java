package com.object;

public class ToString {
	public static void main(String[] args) {
		Monster m = new Monster("aa", "worker", 2000);
		System.out.println(m.toString());
		System.out.println(m);
	}
}

class Monster {
	private String name;
	private String job;
	private double salary;

	public Monster(String name, String job, double salary) {
		super();
		this.name = name;
		this.job = job;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", job=" + job + ", salary=" + salary + "]";
	}

}