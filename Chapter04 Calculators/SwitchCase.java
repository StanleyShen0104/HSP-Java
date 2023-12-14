import java.util.Scanner;

public class SwitchCase{
	public static void main(String[] args) {
		//switch01.java
		System.out.println("please input your char");
		Scanner mysc = new Scanner(System.in);
		char c1 = mysc.next().charAt(0);
		switch (c1) {
			case 'a':
				System.out.println("Today is Monday");
				break;
			case 'b':
				System.out.println("Today is Tuesday");
				break;
			case 'c':
				System.out.println("Today is Wednesday");
				break;
			case 'd':
				System.out.println("Today is Thursday");
				break;
			case 'e':
				System.out.println("Today is Friday");
				break;
			case 'f':
				System.out.println("Today is Saturday");
				break;
			case 'g':
				System.out.println("Today is Sunday");
				break;
			default:
				System.out.println("input error");
				break;
		}
	}
}