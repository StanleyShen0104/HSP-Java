import java.util.Scanner;
public class P0143_BreakEx2 {
	public static void main(String[] args) {

		/*
			�û���������
			���룺123
			�ɹ���ʾ��½�ɹ�
			����������ᣬ���������ʾ��ʣ���λ���

			ע�⣺�ַ����Ƚ�Ҫ��equals()����
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
			if ("����".equals(user) && "123".equals(pass)) {
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
