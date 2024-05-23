package homework10;

public class Homework10 {
	public static void main(String[] args) {
		Doctor d1 = new Doctor("Sam", 22, "Cook", 'm', 1950);
		Doctor d2 = new Doctor("Jim", 22, "Cook", 'm', 1950);
		Doctor d3 = new Doctor("Sam", 22, "Cook", 'm', 1950);
		System.out.println("d1 is equal to d2 : " + d1.equals(d2));
		System.out.println("d1 is equal to d3 : " + d1.equals(d3));
	}
}
