package com.modifier;

import com.modifier.trying.C;

public class A {
	public int n1 = 100;
	protected int n2 = 200;
	int n3 = 300;
	private int n4 = 400;

	public void accessable() {
		System.out.println("Same Class Access:" + n1 + n2 + n3 + n4);

		B b = new B();
		System.out.println("Same Package Access:" + b.n1 + b.n2 + b.n3); // b.n4 is private

		C c = new C();
		System.out.println("Different Package Access:" + c.n1); // c.n1 is public only
	}

	public static void main(String[] args) {
		A a = new A();
		a.accessable();
	}
}
