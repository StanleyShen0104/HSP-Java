import java.util.Scanner;

public class P0118_SwitchCaseEx3 {
	public static void main(String[] args) {
		
		/*
			根据指定月份，打印该月份所属季节，345春678夏91011秋1212冬
		*/
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Month:");
		int month = myscanner.nextInt();
		if (month <= 12 && month >= 0) {
			switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("Winter");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Spring");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("Summer");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("Autumn");
				break;
			}
		} else {
			System.out.println("Input Error");
		}
	}
}
