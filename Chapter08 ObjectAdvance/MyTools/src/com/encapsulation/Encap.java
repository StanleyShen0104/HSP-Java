package com.encapsulation;

public class Encap {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("ABC");
		p.setAge(16);
		p.setSalary(1000);
		System.out.println("name:" + p.getName() + "\tage:" + p.getAge() + "\tsalary:" + p.getSalary());
	}
}

class Person {
	private String name = "Invalid";
	private int age = 30;
	private double salary = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 2 && name.length() <= 6) {
			this.name = name;
		} else {
			System.out.println("Not a valid name");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 1 && age <= 120) {
			this.age = age;
		} else {
			System.out.println("Age out of human range");
		}
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
