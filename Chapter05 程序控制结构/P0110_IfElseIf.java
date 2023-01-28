import java.util.Scanner;

public class P0110_IfElseIf {
	public static void main(String[] args) {
		
		/*
			信用分评级
			1、100分 信用极好
			2、(80,99] 信用优秀
			3、[60,80] 信用一般
			4、其他 信用不及格
		*/
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Your Credit Point(0-100):");
		int credit = myscanner.nextInt();
		if (credit <= 100 && credit >= 0 ) {
			if (credit == 100) {
				System.out.println("Credit Excellent");
			} else if (credit > 80 && credit <= 99) {
				System.out.println("Credit Good");
			} else if (credit >= 60 && credit <= 80) {
				System.out.println("Credit OK");
			} else {
				System.out.println("Credit False");
			}
		} else {
			System.out.println("Credit Point Error, please check");
		}

	}	
}