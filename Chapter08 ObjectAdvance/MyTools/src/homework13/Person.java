package homework13;

public class Person {
	private String name;
	private char sex;
	private int age;
	private String game;

	public Person(String name, char sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String play() {
		return this.name + " likes play ";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + this.name + " age: " + this.age;
	}

}
