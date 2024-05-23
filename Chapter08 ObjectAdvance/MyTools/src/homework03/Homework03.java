package homework03;

public class Homework03 {
	public static void main(String[] args) {
		Teacher p1 = new Teacher("Kim", 32, "A", 15000);
		Professor p2 = new Professor("Jim", 40, "B", 25000);
		AssociateProfessor p3 = new AssociateProfessor("Sailer", 30, "C", 18000);
		Lecturer p4 = new Lecturer("Chris", 28, "D", 15000);
		System.out.println(p1.introduce());
		System.out.println(p2.introduce());
		System.out.println(p3.introduce());
		System.out.println(p4.introduce());
	}
}
