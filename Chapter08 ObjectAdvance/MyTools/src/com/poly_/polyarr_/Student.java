package com.poly_.polyarr_;

public class Student extends Person{
	private double score;

	public Student(String name, int age, double score) {
		super(name, age);
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	@Override
	public String say() {
		// TODO Auto-generated method stub
		return super.say() + " score: " + score;
	}
	public void study() {
		System.out.println("student " + super.getName() + " is studying");
	}
	
}
