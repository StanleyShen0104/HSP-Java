import java.util.Scanner;

public class P0085_Input {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		//System.in 说明是键盘录入
		System.out.println("Your Name:");
		String name = myScanner.next();
		System.out.println("Your Age:");
		int age = myScanner.nextInt();
		System.out.println("Your Salary:");
		double sal = myScanner.nextDouble();
		System.out.println("Name:\tAge:\tSalary:\n" + 
			name + "\t" + age + "\t" + sal);
	}	
}