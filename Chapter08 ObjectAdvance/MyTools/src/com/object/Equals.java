package com.object;

public class Equals {
	public static void main(String[] args) {
		Person p1 = new Person("aa", 18, 'm');
		Person p2 = new Person("aa", 18, 'm');
		System.out.println(p1.equals(p2));
	}
}

class Person {
	private String name;
	private int age;
	private char gender;
	
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		else if(obj instanceof Person) {
			Person p = (Person)obj;
			if (p.name.equals(this.name) && p.age == this.age && p.gender == this.gender) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
}