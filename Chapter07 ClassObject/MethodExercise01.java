import java.util.Scanner;

public class MethodExercise01 {
	public static void main(String[] args) {
		//class AA new void  odd?
		Scanner mysc = new Scanner(System.in);
		System.out.println("Your Number:");
		int num = mysc.nextInt();
		System.out.println("Input Rows(1~5):");
		int row = mysc.nextInt();
		System.out.println("Input Colums(1~10):");
		int col = mysc.nextInt();
		System.out.println("Input String");
		String str = mysc.next();
		
		AA aa = new AA();
		System.out.println("Is Odd:" + aa.odd(num));
		
		//print
		aa.print(row, col, str);
	
	}
}

class AA {
	public boolean odd(int num) {
		return num % 2 == 0;
	}
	
	public void print(int row, int col, String str) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == row - 1 && j == col - 1) {
					System.out.print(str);
				}
				else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}
}