package homework03;

public class AssociateProfessor extends Teacher {
	private double sallevel = 1.2;

	public AssociateProfessor(String name, int age, String post, double salary) {
		super(name, age, post, salary);
	}
	
	public String introduce() {
		return super.toString() + ", salaryLevel=" + this.sallevel;
	}
}
