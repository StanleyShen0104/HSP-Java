package homework05;

public class Teacher extends Employee {
	private double classwage;
	private int days;
	
	public Teacher(double wage, double classwage, int days) {
		super(wage);
		super.setType("Teacher");
		this.classwage = classwage;
		this.days = days;
	}

	@Override
	public String salary() {
		// TODO Auto-generated method stub
		super.setAnnual(super.getAnnual()+ this.classwage * days);
		return super.salary();
	}
	
	
	
	
}
