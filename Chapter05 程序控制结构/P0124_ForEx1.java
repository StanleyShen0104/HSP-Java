public class P0124_ForEx1 {
	public static void main(String[] args) {
		/*
			��ӡ1-100֮������9�ı�������������ͳ�Ƹ������ܺ�
		*/
		int sum = 0;
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 9 == 0) {
				System.out.println(i);
				count++;
				sum += i;
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
	}
}
