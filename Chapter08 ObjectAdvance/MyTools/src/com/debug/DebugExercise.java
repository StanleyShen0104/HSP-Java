package com.debug;

public class DebugExercise {
	public static void main(String[] args) {
		Person p = new Person("Sam", 22);
		System.out.println(p);
	}
}

class Person {
	private String name = "none";
	private int age = 18;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + this.name + "\tage: " + this.age;
	}
}
