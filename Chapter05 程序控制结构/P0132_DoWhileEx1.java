public class P0132_DoWhileEx1 {
	public static void main(String[] args) {
		/*
			ͳ��1-200֮���ܱ�5���������ܱ�3���������ĸ���
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
