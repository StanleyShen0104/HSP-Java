package com.inheritance;

public class Father {
	public String name;
	public int age;
	private double score;
	protected int aa;
	int aaa;
	private int aaaa;


	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public void showInfo() {
		System.out.println("Student name:" + name + " age:" + age + " score:" + score);
	}
}
