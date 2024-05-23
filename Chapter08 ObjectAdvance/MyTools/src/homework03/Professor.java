package homework03;

public class Professor extends Teacher {
	private double sallevel = 1.3;

	public Professor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
		this.sallevel = sallevel;
	}
	
	public String introduce() {
		return super.toString() + ", salaryLevel=" + this.sallevel;
	}
}
