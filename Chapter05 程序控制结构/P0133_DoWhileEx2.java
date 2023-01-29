import java.util.Scanner;
public class P0133_DoWhileEx2 {
	public static void main(String[] args) {
		/*
			直到输入y终止循环
		*/
		char ans = ' ';
		Scanner myscanner = new Scanner(System.in);
		do {
			System.out.println("Y/N");
			ans = myscanner.next().charAt(0);
		} while(ans != 'Y');
		System.out.println("Fin");

	}
}
