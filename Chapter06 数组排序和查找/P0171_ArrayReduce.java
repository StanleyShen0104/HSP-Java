import java.util.Scanner;
public class P0171_ArrayReduce {
	public static void main(String[] args) {
		
		/*	
			数组删元素
			询问用户是否需要继续删
			当只剩一个元素时自动停止
		*/
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b;
		Scanner myscanner = new Scanner(System.in);
		while (a.length > 1) {
			System.out.println("\n"+"是否需要继续删数据Y/N：");
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
				System.out.println("输入有误请重新输入...");
				continue;
			}
		}
		System.out.println("结束");
	}	
}