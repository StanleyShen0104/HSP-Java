public class P0142_BreakEx1 {
	public static void main(String[] args) {

		/*
			1-100��ͣ����͵�һ�δ���20ʱ�ĵ�ǰ��
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
