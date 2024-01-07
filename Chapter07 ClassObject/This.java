public class This {
	public static void main(String[] args) {
		Person p1 = new Person("AA", 12);
		Person p2 = new Person("AA", 12);
		Person p3 = p1;
		p1.compareTo(p2);
		p1.compareTo(p3);
		TestPerson tp = new TestPerson(p1, p2);
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void compareTo(Person p2) {
		boolean same = this.hashCode() == p2.hashCode();
		System.out.println("is same person: " + same);
	}
}

class TestPerson {
	String name1,name2;
	int age1,age2;
	
	public TestPerson(Person p1, Person p2) {
		this.name1 = p1.name;
		this.name2 = p2.name;
		this.age1 = p1.age;
		this.age2 = p2.age;
		System.out.println("name and age are euqal: " + this.check());
	}
	
	public boolean check() {
		return name1.equals(name2) && age1 == age2;
	}			
}
