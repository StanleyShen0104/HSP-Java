public class P0138_Break {
	public static void main(String[] args) {

		/*
			break������

			�������1-100���������ֱ������97����������˶��ٴ�
		*/
		int count = 0;
		int num = 0;
		while (true) {
			num = (int)(Math.random() * 100) + 1;
			if (num == 97) {
				break;
			}
			count += 1;

		}
		System.out.println("Tried:" + count);
	}
}
