import java.util.Scanner;
public class P0137_HollowTower {
	public static void main(String[] args) {
		/*
			空心金字塔

			分析：
			1、先打印实心直角三角形，第n行有n个星号
			2、平移形成实心金字塔
			3、金字塔掏空
		*/

		/* 第一步 直角三角已实现
		Scanner myscanner = new Scanner(System.in);
		System.out.println("positive number:");
		int h = myscanner.nextInt();
		if (h <= 0) {
			System.out.println("Input Error");//验证是否为正数
		} else {
			for (int i = 1; i <= h; i++) {
				int j = 1;//第i行打2*(i-1)+1个
				while (j <= 2 * (i - 1) + 1) {
					System.out.print("*");
					j++;
				}
				System.out.print("\n");
			}
		}
		*/

		/* 第二部 金字塔已实现
		Scanner myscanner = new Scanner(System.in);
		System.out.println("positive number:");
		int h = myscanner.nextInt();
		if (h <= 0) {
			System.out.println("Input Error");//验证是否为正数
		} else {
			for (int i = 1; i <= h; i++) {
				int j = 1;//第i行打2*(i-1)+1个
				//第i行左侧打印(h-i)个空格
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

		//第三部 挖空
		Scanner myscanner = new Scanner(System.in);
		System.out.println("positive number:");
		int h = myscanner.nextInt();
		if (h <= 0) {
			System.out.println("Input Error");//验证是否为正数
		} else {
			for (int i = 1; i <= h; i++) {
				int j = 1;//第i行打2*(i-1)+1个
				//第i行左侧打印(h-i)个空格
				for (int k = 1; k <= h - i; k++) {
					System.out.print(" ");
				} 
				while (j <= 2 * (i - 1) + 1) {
					//当j不是首位时，打空格，首位打星号
					//当i是最后一行时也要全打
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
