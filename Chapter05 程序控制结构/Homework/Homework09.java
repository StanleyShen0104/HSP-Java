public class Homework09 {
	public static void main(String[] args) {

		/*
			求 1 + (1+2) +(1+2+3) + ...(1+2+...+100)
		*/
		int sum = 0;
		int sum1 = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
			sum1 += sum;
		}
		System.out.print(sum1);

	}
}
