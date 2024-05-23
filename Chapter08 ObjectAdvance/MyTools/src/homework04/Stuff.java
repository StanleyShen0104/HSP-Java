package homework04;

public class Stuff extends Employee {

	public Stuff(String name, double wage, int days, double level) {
		super(name, wage, days, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printsal() {
		// TODO Auto-generated method stub
		System.out.println("name:" + super.getName() + "\tmonthly salary is:" + super.getSalary() * super.getLevel());
	}

}
