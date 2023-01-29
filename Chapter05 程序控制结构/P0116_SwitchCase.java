import java.util.Scanner;

public class P0116_SwitchCase {
	public static void main(String[] args) {
		
		/*
			接受一个char，abcdefg
			分别代表周一到周日
			使用switch case实现

			switch case细节：
			1、switch(a),case(b) a,b必须是同数据类型或者可以自动转换的
			2、a只能是byte，short，int，char，enum，String；
				long，float，double，boolean则会报错
			3、b中的值不能是声明的变量，必须是常量或常量表达式
			4、default是可选的
			5、注意：switch case语句需搭配break使用，否则具有穿透性
		*/
		Scanner myscanner = new Scanner(System.in);
		System.out.println("Please Input(a-g):");
		char msg = myscanner.next().charAt(0);

		switch (msg) {
		case 'a':
			System.out.println("Monday");
			break;
		case 'b':
			System.out.println("Tuesday");
			break;
		case 'c':
			System.out.println("Wednesday");
			break;
		case 'd':
			System.out.println("Thursday");
			break;
		case 'e':
			System.out.println("Friday");
			break;
		case 'f':
			System.out.println("Saturday");
			break;
		case 'g':
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Info Input Error");
		}
	}
}
