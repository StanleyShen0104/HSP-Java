package com.poly_.polyarr_;

public class PolyArray {
	public static void main(String[] args) {
		Person persons[] = new Person[5];
		persons[0] = new Person("Tom", 28);
		persons[1] = new Student("John", 18, 99);
		persons[2] = new Student("Will", 19, 67);
		persons[3] = new Teacher("Randle", 35, 5000);
		persons[4] = new Teacher("Smith", 38, 6000);
		for (int i = 0; i< persons.length; i++) {
			System.out.println(persons[i].say());
		}
		for (int i = 0; i< persons.length; i++) {
			if (persons[i] instanceof Student) {
				((Student)persons[i]).study(); //通过强转调用子类独有方法
			}
			else if (persons[i] instanceof Teacher) {
				((Teacher)persons[i]).teach(); //通过强转调用子类独有方法
			}
		}
		
	}
}

