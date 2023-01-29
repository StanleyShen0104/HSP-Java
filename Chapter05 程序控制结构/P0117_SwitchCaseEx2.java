import java.util.Scanner;

public class P0117_SwitchCaseEx2 {
	public static void main(String[] args) {
		
		/*
			使用switch，输入double成绩，大于等于60分输出合格，小于60分输出不合格
		*/
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Point:");
		double point = myscanner.nextDouble();
		if (point <= 100 && point >= 0) {
			int point1 = (int)point / 60;
			switch (point1) {
			case 1:
				System.out.println("Pass");
				break;
			case 0:
				System.out.println("Not Pass");
				break;
			}
		} else {
			System.out.println("Input Error");
		}
	}
}
