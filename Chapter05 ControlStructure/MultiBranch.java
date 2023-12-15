import java.util.Scanner;

public class MutiBranch{
	public static void main(String[] args) {
		//multi-branch
		Scanner mysc = new Scanner(System.in);
		System.out.println("Your grade:");
		double grade = mysc.nextDouble();
		if(grade > 8) {
			System.out.println("Your gender:F/M");
			char gender = mysc.next().charAt(0);
			if(gender == 'M') {
				System.out.println("You are in male group");
			}
			else if(gender == 'F'){
				System.out.println("You are in female group");
			}
			else {
				System.out.println("Input error or you are a QUEER");
			}
		}
		else {
			System.out.println("You are out");
		}
	}
}