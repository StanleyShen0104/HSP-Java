public class P0066_Exercise {
	public static void main(String[] args) {

		//59天是多少周零几天
		int days = 59;
		int weeks = days / 7;
		int remainDays = days - weeks * 7;
		System.out.println(weeks);
		System.out.println(remainDays);

		//5/9*(H-100) H=234.5
		double H = 234.5;
		double C = 5.0 / 9 * (H - 100);
		System.out.println(C);
	}	
}