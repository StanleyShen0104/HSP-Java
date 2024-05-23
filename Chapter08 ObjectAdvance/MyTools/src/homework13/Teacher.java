package homework13;

public class Teacher extends Person {
	private int work_age;

	public Teacher(String name, char sex, int age, int work_age) {
		super(name, sex, age);
		this.work_age = work_age;
	}

	public int getWork_age() {
		return work_age;
	}

	public void setWork_age(int work_age) {
		this.work_age = work_age;
	}

	public void teach() {
		System.out.println("i promise i will teach well");
	}

	public void printing() {
		System.out.println("name: " + super.getName() + "\nage: " + super.getAge() + "\ngender: " + super.getSex()
				+ "\nwork age: " + this.work_age);
		this.teach();
		System.out.println(this.play());
	}

	@Override
	public String play() {
		// TODO Auto-generated method stub
		return super.play() + "chess";
	}

}
