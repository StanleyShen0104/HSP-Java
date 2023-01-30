public class Homework03 {
	public static void main(String[] args) {

		/*
			判断一个年份是否为闰年
			公元年分为4的倍数但非100的倍数，为闰年。
			公元年分为400的倍数为闰年。
		*/
		int year = 2100;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		
	}
}
