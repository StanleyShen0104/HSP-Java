import java.util.Scanner;
public class P0137_HollowTower {
	public static void main(String[] args) {
		/*
			���Ľ�����

			������
			1���ȴ�ӡʵ��ֱ�������Σ���n����n���Ǻ�
			2��ƽ���γ�ʵ�Ľ�����
			3���������Ϳ�
		*/

		/* ��һ�� ֱ��������ʵ��
		Scanner myscanner = new Scanner(System.in);
		System.out.println("positive number:");
		int h = myscanner.nextInt();
		if (h <= 0) {
			System.out.println("Input Error");//��֤�Ƿ�Ϊ����
		} else {
			for (int i = 1; i <= h; i++) {
				int j = 1;//��i�д�2*(i-1)+1��
				while (j <= 2 * (i - 1) + 1) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
			}
		}
		*/

		/* �ڶ��� ��������ʵ��
		Scanner myscanner = new Scanner(System.in);
		System.out.println("positive number:");
		int h = myscanner.nextInt();
		if (h <= 0) {
			System.out.println("Input Error");//��֤�Ƿ�Ϊ����
		} else {
			for (int i = 1; i <= h; i++) {
				int j = 1;//��i�д�2*(i-1)+1��
				//��i������ӡ(h-i)���ո�
				for (int k = 1; k <= h - i; k++) {
					System.out.print(" ");
				} 
				while (j <= 2 * (i - 1) + 1) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
			}
		}
		*/

		//������ �ڿ�
		Scanner myscanner = new Scanner(System.in);
		System.out.println("positive number:");
		int h = myscanner.nextInt();
		if (h <= 0) {
			System.out.println("Input Error");//��֤�Ƿ�Ϊ����
		} else {
			for (int i = 1; i <= h; i++) {
				int j = 1;//��i�д�2*(i-1)+1��
				//��i������ӡ(h-i)���ո�
				for (int k = 1; k <= h - i; k++) {
					System.out.print(" ");
				} 
				while (j <= 2 * (i - 1) + 1) {
					//��j������λʱ����ո���λ���Ǻ�
					//��i�����һ��ʱҲҪȫ��
					if (i == h || j == 1 || j == 2 * (i - 1) + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}				
					j++;
				}
				System.out.print("\n");
			}
		}
	}
}
