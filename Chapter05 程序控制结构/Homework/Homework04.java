public class Homework06 {
	public static void main(String[] args) {

		/*
			输出1-100之间不能被5整除的数
		*/
		int n1,n2,n3;

		for (int i = 100; i <= 999; i++) {
			n1 = i / 100;
			n2 = (i - n1 * 100) / 10;
			n3 = i - n1 * 100 - n2 * 10;
			int sum = n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3;
			if (sum == i) {
				System.out.println(i);
			}
		}
		
	}
}
