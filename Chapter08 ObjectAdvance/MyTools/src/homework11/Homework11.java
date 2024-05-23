package homework11;

public class Homework11 {
	public static void main(String[] args) {
		Person p = new Student();
		p.eat();
		p.run();
		Student s = (Student)p;
		s.run();
		s.study();
		s.eat();
		
	}
}

class Person {
	public void run() {
		System.out.println("People runing");
	}

	public void eat() {
		System.out.println("People eating");
	}
}

class Student extends Person {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println("Student runing");
	}

	public void study() {
		System.out.println("Student studing");
	}
}