public class ChapterExercise04 {
	public static void main(String[] args) {
		AA aa = new AA();
		double bb = aa.method(10.0, 20.0);
		System.out.println(aa.method(bb, 100));
	}
}

class AA {
	public double method(double m1, double m2) {
		return 1.0;
	}
}

class Employee {
	String name, gender, position;
	int age, salary;
	public Employee(String name, String gender, int age,
			String position, int salary) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}
	public Employee(String name, String gender, int age) {
		this(name, gender, age, null, 0);
	}
	public Employee(String position, int salary) {
		this(null, null, 0, position, salary);
	}
}