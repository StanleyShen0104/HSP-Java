import java.util.Scanner;

public class P0104_IfElse {
	public static void main(String[] args) {
		
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Your Age:");
		int age = myscanner.nextInt();
		if (age >= 18) {
			System.out.println("You are an adult");
		} else {
			System.out.println("You aren't an adult");
		}

	}	
}