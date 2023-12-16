import java.util.Scanner;

public class MultiLoop{
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		double total = 0;
		double classTotal = 0;
		for (int i = 1; i <= 3; i++) {
			classTotal = 0;
			for (int j = 1; j<= 5; j++) {
				System.out.println("No."+ i + " class No." + j + " student's grade:");
				double grade = mysc.nextDouble(); 
				classTotal += grade;
				total += grade;
			}
			System.out.println("No."+ i + " class grade avg=" + (classTotal / 5));
		}
		System.out.println("Total grade avg=" + (total / 15));
	}
}