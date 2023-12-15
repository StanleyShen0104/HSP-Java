import java.util.Scanner;

public class SwitchCaseEx{
	public static void main(String[] args) {
		//1
		Scanner mysc = new Scanner(System.in);
		System.out.println("input your undercase char");
		char c1 = mysc.next().charAt(0);
		switch(c1) {
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			 default:
				System.out.println("WRONG");
				break;
		}
		
		//2
		System.out.println("input your grade");
		double grade = mysc.nextDouble();
		if (grade > 100 || grade < 0) {
			System.out.println("Input Error");
		}
		else {
			int m = (int)grade / 60;
			switch(m) {
				case 0:
					System.out.println("Failed");
					break;
				case 1:
					System.out.println("Passed");
					break;
			}
		}
		
		//3
		System.out.println("input month");
		int month = mysc.nextInt();
		if (month > 0 && month < 13) {
			switch(month) {
				case 3:
				case 4:
				case 5:
					System.out.println("spring");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("summer");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println("autumn");
					break;
				case 12:
				case 1:
				case 2:
					System.out.println("winter");
					break;
			}
		}
		else {
			System.out.println("input error");
		}
	}	
}