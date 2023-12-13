import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		Scanner mysc = new Scanner(System.in);
		System.out.println("Your name:");
		String name = mysc.next();
		System.out.println("Your age:");
		int age = mysc.nextInt();
		System.out.println("Your score:");
		double score = mysc.nextDouble();
		System.out.println("NAME:"+name+'\t'+"AGE:"+
		age+'\t'+"SCORE:"+score+'\t');
	}
}