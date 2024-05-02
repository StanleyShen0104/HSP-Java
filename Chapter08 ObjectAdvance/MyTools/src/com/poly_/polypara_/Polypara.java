package com.poly_.polypara_;

public class Polypara {
	public static void main(String[] args) {
		Employee arr[] = new Employee[2];
		arr[0] = new stuff("Tom", 10000);
		arr[1] = new manager("Jack", 11000, 10000);
		for (int i = 0; i < arr.length; i++) {
			Testing t = new Testing(arr[i]);
			System.out.println(arr[i].getName() + " annual salary is " + t.getAnnual());
			t.testWork(arr[i]);
			"abc".equals("bcd");
		}
	}
}