import java.util.Scanner;

public class P0108_Exercise3 {
	public static void main(String[] args) {
		
		/*
			判断所输入年份是否为闰年，闰年判断满足以下两条件任意
			1、年份能被4整除，但不能被100整除
			2、能被400整除
		*/
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Set Year:");
		int year = myscanner.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}	
}