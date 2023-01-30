public class Homework07 {
	public static void main(String[] args) {

		/*
			输出小写的a-z，以及大写的Z-A
			ascii a-z 97-122
			ascii Z-A 90-65
		*/
		char c1 ,c2;
		for (int i = 0; i <= 25; i++) {
			c1 = (char)(97 + i);
			System.out.print(c1 + " ");
		}
		System.out.print("\n");

		for (int j = 0; j <= 25; j++) {
			c2 = (char)(90 - j);
			System.out.print(c2 + " ");
		}
	}
}
