public class P0141_BreakDetail {
	public static void main(String[] args) {

		/*
			break label��������ָ��label
			ʵ��ʹ���У�������Ҫ�ñ�ǩ
		*/
		int count = 0;
		int num = 0;
		lab:
		while (true) {
			num = (int)(Math.random() * 100) + 1;
			if (num == 97) {
				break lab;
			}
			count += 1;

		}
		//���������ִ��
		System.out.println("Tried:" + count);
	}
}
