import java.util.Scanner;

public class P0117_SwitchCaseEx1 {
	public static void main(String[] args) {
		
		/*
			使用switch把输入的小写类型char转换为大写，只转换abcde，其他输出others
		*/
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Please Input(a-e):");
		char msg = myscanner.next().charAt(0);

		switch (msg) {
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
			System.out.println("Others");
		}
	}
}
