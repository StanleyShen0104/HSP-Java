import java.util.Scanner;

public class DoWhileLoop{
	public static void main(String[] args) {
		//1 1-100
		//2 sum(1-100)
		int i = 1, sum = 0;
		do {
			System.out.println(i);
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("Sum="+sum);
		
		//3count 1-200 %5=0 %3 !=0
		int j = 1, count = 0;
		do {
			if (j % 5 == 0 && j % 3 != 0) {
				count += 1;
			}
			j++;
		}while(j <= 200);
		System.out.println("Count="+count);
		
		//4 do you pay?
		Scanner mysc = new Scanner(System.in);
		char reply;
		do {
			System.out.println("Do you pay? y/n");
			reply = mysc.next().charAt(0);
		}while(reply != 'y');
	}
}