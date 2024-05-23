package homework04;

public class Manager extends Employee {

	public Manager(String name, double wage, int days, double level) {
		super(name, wage, days, level);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void printsal() {
		// TODO Auto-generated method stub
		System.out.println(
				"name:" + super.getName() + "\tannual salary is:" + (1000 + super.getSalary() * super.getLevel()));
	}
}
