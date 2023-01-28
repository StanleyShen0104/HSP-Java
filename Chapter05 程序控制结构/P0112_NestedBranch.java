import java.util.Scanner;

public class P0112_NestedBranch {
	public static void main(String[] args) {
		
		/*
			接受两个信息，性别和分数
			成绩大于8.0入决赛，否则淘汰
			并根据性别决定进入男子组或女子组
		*/
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Your Point(0-10):");
		double point = myscanner.nextDouble();
		System.out.println("Your Gender(M/F):");
		char gender = myscanner.next().charAt(0);
		if (point >= 0 && point <= 10 && (gender == 'M' || gender == 'F')) {
			if (point >= 8) {
				if (gender == 'M') {
					System.out.println("Male Group");
				} else {
					System.out.println("Female Group");
				}
			} else {
				System.out.println("Failed");
			}
		} else {
			System.out.println("Info Input Error");
		}
	}	
}