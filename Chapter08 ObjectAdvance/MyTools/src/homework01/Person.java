package homework01;

public class Person {
	private String name;
	private String job;
	private int age;

	public Person(String name, String job, int age) {
		super();
		this.name = name;
		this.job = job;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + ", age=" + age + "]";
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
