public class P0020_EscapeCharacter {
	public static void main(String[] args) {
		// \t:�Ʊ�λ��ʵ�ֶ���
		System.out.println("A\tB\tC");
		
		// \n:���з�
		System.out.println("A\nB");

		// \\:һ��\,��������2n
		System.out.println("A\\B");

		// \":һ��"
		System.out.println("A\"B\"C");

		// \":һ��'
		System.out.println("A\'B\'C");

		// \r:�س����������滻�������\n���滻
		System.out.println("ABCDEF\rG");

		//������ϰ
		System.out.println("����\t����\t�۸�\t����\n����\t�޹���\t120\t1000");

	}

}