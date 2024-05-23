package homework03;

public class Lecturer extends Teacher {
	private double sallevel = 1.1;

	public Lecturer(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}

	public String introduce() {
		return super.toString() + ", salaryLevel=" + this.sallevel;
	}
}
