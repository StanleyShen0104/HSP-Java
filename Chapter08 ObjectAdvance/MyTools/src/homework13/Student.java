package homework13;

public class Student extends Person {
	private String stu_id;

	public Student(String name, char sex, int age, String stu_id) {
		super(name, sex, age);
		this.stu_id = stu_id;
	}

	public String getStu_id() {
		return stu_id;
	}

	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}

	public void study() {
		System.out.println("I promise i will study hard");
	}

	public void printing() {
		System.out.println("name: " + super.getName() + "\nage: " + super.getAge() + "\ngender: " + super.getSex()
				+ "\nID: " + this.stu_id);
		this.study();
		System.out.println(this.play());
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return super.play() + "soccer";
	}
}
