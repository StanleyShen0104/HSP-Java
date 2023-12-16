import java.util.Scanner;
import java.lang.Math;

public class ChapterExercise{
	public static void main(String[] args) {
		//1
		double money = 100000;
		int count = 0;
		while (true) {
			if (money > 50000) {
				money *= 0.95;
			}
			else if (money >= 1000) {
				money -= 1000;
			}
			else {
				System.out.println(count + "times");
				break;
			}
			count += 1;
		}

	
		//2 3 too simple skip
		
		//4
		Scanner mysc = new Scanner(System.in);
		int num;
		while (true) {
			System.out.println("Your Number:");
			num = mysc.nextInt();
			if (num >= 100 && num <= 999) {
				break;
			}
			System.out.println("Input Error");
		}
		int hun = num / 100;
		int ten = (num - 100 * hun) / 10;
		int one = num - 100 * hun - 10 * ten;
		if (num == Math.pow(hun, 3) + Math.pow(ten, 3) + Math.pow(one, 3)) {
			System.out.println(num + " is a Narcissistic number");
		}
		else {
			System.out.println(num + " is not a Narcissistic number");
		}
		
		//5 nothing will be printed
		
		//6 print 1-100 %5 != 0;5 each row
		for (int i = 1, count6 = 1; i <= 100; i++) {
			if (i % 5 != 0 && count6 % 5 == 0) {
				System.out.println(i + "\t");
				count6 += 1;
			}
			else if (i % 5 != 0 && count6 % 5 != 0) {
				System.out.print(i + "\t");
				count6 += 1;
			}
		}
		
		//7 print a-z and Z-A
		for (char i = 97; i <= 122; i++) {
			System.out.print(i);
		}
		System.out.println("");
		for (char i = 90; i >= 65; i--) {
			System.out.print(i);
		}
		
		//8 sum 1-1/2+1/3-1/4...1/100
		double calSum = 0;
		for (int i = 1; i <= 100; i++) {
			calSum += Math.pow(-1, i + 1) *  1d / i;
		}
		System.out.println("\n" + calSum);
		
		//9 sum 1 + (1+2) + (1+2+3) + ... + (1+..100)
		int totalSum = 0;
		for (int i = 1, sum9 = 0; i <= 100; i++) {
			sum9 += i;
			totalSum += sum9;
		}
		System.out.println(totalSum);
	}
}