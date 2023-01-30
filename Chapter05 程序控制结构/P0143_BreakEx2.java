import java.util.Scanner;
public class P0143_BreakEx2 {
	public static void main(String[] args) {

		/*
			用户命：丁真
			密码：123
			成功提示登陆成功
			三次输入机会，输入错误提示还剩几次机会

			注意：字符串比较要用equals()方法
		*/
		Scanner myscanner = new Scanner(System.in);
		String user;
		String pass;
		int count = 1;
		while (count <= 3) {
			System.out.println("Username:");
			user = myscanner.next();
			System.out.println("Password:");
			pass = myscanner.next();
			if ("丁真".equals(user) && "123".equals(pass)) {
				System.out.println("Login Success!");
				break;
			} else {
				System.out.println("Error,Chance Left: " + (3 - count));
				if (count == 3) {
					System.out.println("Login Failed");
					break;
				}
				count++;
			}
		}
	}
}
