import java.util.Scanner;
public class P0175_SeqSearch {
	public static void main(String[] args) {
		
		/*	
			˳����ң������±�ֵ
		*/
		System.out.println("��������������");
		Scanner mys = new Scanner(System.in);
		String name = mys.next();
		String[] a = { "��üʨ��", "��ëʨ��", "��������", "��������"};
		for (int i = 0; i < a.length; i++) {
			if (name.equals(a[i])) {
				System.out.println("�ҵ�"+a[i]+" ����ֵΪ"+i);
				break;
			} else if (i == a.length -1) {
				System.out.println("������");
				break;
			}
		}	
	}	
}