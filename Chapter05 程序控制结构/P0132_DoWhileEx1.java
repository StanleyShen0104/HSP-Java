public class P0132_DoWhileEx1 {
	public static void main(String[] args) {
		/*
			统计1-200之间能被5整除但不能被3整除的数的个数
		*/
		int i = 1;
		int count = 0;
		do {
			if (i % 5 == 0 && i % 3 != 0) {
				count++;
			}
			i++;
		} while(i <= 200);
		System.out.println(count);

	}
}
