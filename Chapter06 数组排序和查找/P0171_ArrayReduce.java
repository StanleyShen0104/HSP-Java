import java.util.Scanner;
public class P0171_ArrayReduce {
	public static void main(String[] args) {
		
		/*	
			����ɾԪ��
			ѯ���û��Ƿ���Ҫ����ɾ
			��ֻʣһ��Ԫ��ʱ�Զ�ֹͣ
		*/
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b;
		Scanner myscanner = new Scanner(System.in);
		while (a.length > 1) {
			System.out.println("\n"+"�Ƿ���Ҫ����ɾ����Y/N��");
			char ans = myscanner.next().charAt(0);
			if (ans == 'N') {
				break;
			} else if (ans == 'Y') {
				b = new int[a.length - 1];
				for (int i = 0; i < a.length - 1;i++) {
					b[i] = a[i];
				}
				a = b;
				for (int j = 0; j < a.length; j++) {
					System.out.print(a[j] + "\t");					
				}
			} else {
				System.out.println("������������������...");
				continue;
			}
		}
		System.out.println("����");
	}	
}