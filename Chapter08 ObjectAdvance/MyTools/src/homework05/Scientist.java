package homework05;

public class Scientist extends Employee{
	private double bonus;

	public Scientist(double wage, double bonus) {
		super(wage);
		super.setType("Scientist");
		this.bonus = bonus;
	}

	@Override
	public String salary() {
		// TODO Auto-generated method stub
		super.setAnnual(super.getAnnual() + this.bonus);
		return super.salary();
	}
	
	
}
