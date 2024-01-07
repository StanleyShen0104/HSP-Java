public class Constructor {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Mr.Slade", 48);
		System.out.println("name:" + p1.name +"\tage:" + p1.age);
		System.out.println("name:" + p2.name +"\tage:" + p2.age);
	}
}

class Person {
	String name;
	int age;
	
	public Person() {
		age = 18;
	}
	
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	
}