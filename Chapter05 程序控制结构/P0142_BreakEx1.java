public class P0142_BreakEx1 {
	public static void main(String[] args) {

		/*
			1-100求和，当和第一次大于20时的当前数
		*/
		int sum = 0;
		int i = 1;
		for (; i <= 100; i++) {
			sum += i;
			if (sum > 20) {
				break;
			}
		}
		System.out.println("lastnum: " + i);
	}
}
