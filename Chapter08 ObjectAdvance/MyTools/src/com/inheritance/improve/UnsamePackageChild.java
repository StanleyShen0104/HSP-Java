package com.inheritance.improve;

import com.inheritance.Father;

public class UnsamePackageChild extends Father {
	public void testing() {
		System.out.println("pupil " + this.name + " is testing math");
		int b1 = super.aa;
		
		//int b2 = aaa;	aaa is default, 
		//int b3 = aaaa;	cannot
	}
}

class ForTest extends UnsamePackageChild {
	public void test1() {
		setScore(1);
	}
}
