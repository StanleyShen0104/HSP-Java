import java.util.Scanner;
public class P0169_ArrayAdd {
	public static void main(String[] args) {
		
		/*	
			��������
			ѯ���û��Ƿ���Ҫ��������
		*/
		int[] a = {1, 2, 3};
		int[] b;
		Scanner myscanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n"+"�Ƿ���Ҫ������������Y/N��");
			char ans = myscanner.next().charAt(0);
			if (ans == 'N') {
				break;
			} else if (ans == 'Y') {
				System.out.println("�����벹���������");
				int num = myscanner.nextInt();
				b = new int[a.length + 1];
				for (int i = 0; i < a.length ;i++) {
					b[i] = a[i];
				}
				b[a.length] = num;
				a = b;
				for (int j = 0; j < a.length; j++) {
					System.out.print(a[j] + "\t");					
				}
			} else {
				System.out.println("������������������...");
				continue;
			}
		}
	}	
}