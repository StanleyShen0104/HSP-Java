public class Homework08 {
	public static void main(String[] args) {

		/*
			求1-1/2+1/3-1/4...1/100的和
		*/
		double sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += Math.pow(-1,i+1) * 1.0 / i;
		}
		System.out.print(sum);
	}
}
