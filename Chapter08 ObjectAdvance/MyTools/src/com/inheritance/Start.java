package com.inheritance;

import com.inheritance.improve.Child;

class A {
	int a;

	public A() {
		System.out.println("none");
	}
	public A(int a) {
		System.out.println("have");
	}
	
}

class B extends A {
	public B() {

	}
}

public class Start {
	public static void main(String[] args) {
//		Child c = new Child();
//		c.name = "ABC";
//		c.age = 18;
//		c.setScore(100);
//		c.testing();
//		c.showInfo();
		B b = new B();
		
	}
}
