import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		//1-100 sum>20
		for (int i = 1, sum = 0; i <= 100; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println("num=" + i);
				break;
			}
		}
		
		//2 User:AA Password:123123		
		Scanner mysc = new Scanner(System.in);
		String name, password;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Username:");
			name = mysc.next();
			System.out.println("Password:");
			password = mysc.next();
			if ("AA".equals(name) && "123123".equals(password)) {
				System.out.println("Login Success");
				break;
			}
			else {
				System.out.println("Try Again " + "Remains:" + (3 - i));
			}
		}
	}
}
