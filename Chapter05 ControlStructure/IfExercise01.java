import java.util.Scanner;

public class IfExercise01 {
	public static void main(String arg[]) {
		//02		
		double d1 = 100.0;
		double d2 = 50.0;
		if (d1 > 10.0 && d2 < 20.0) {
			System.out.println(d1 + d2);
		}
		
		//03
		int i1 = 100;
		int i2 = 200;
		int sum = i1 + i2;
		if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("Divisible by 3 and 5");
		}
		else {
			System.out.println("Undivisible by 3 and 5");
		}
		
		//04
		Scanner mysc = new Scanner(System.in);
		System.out.println("Your birth year:");
		int year = mysc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " is leap year");
		}
		else {
			System.out.println(year + " isn't leap year");
		}
	}
}