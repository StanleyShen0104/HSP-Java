package com.override_;

public class Override01 {
	public static void main(String[] args) {
		Person p1 = new Person("wang", 15);
		Student p2 = new Student("kerry", 20, 123, 100);
		System.out.println(p1.say());
		System.out.println(p2.say());
		
	}
	
}
