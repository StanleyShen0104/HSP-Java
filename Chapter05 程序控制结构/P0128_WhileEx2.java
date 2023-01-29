public class P0128_WhileEx2 {
	public static void main(String[] args) {
		/*
			打印40-200所有偶数，while
		*/
		int i = 40;
		while (i <= 200) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}
}
