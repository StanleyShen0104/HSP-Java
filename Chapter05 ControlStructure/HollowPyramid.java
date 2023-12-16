public class HollowPyramid {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			if (i <= 5) {
				for (int k = 1; k <= 6 - i; k++) {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <= 2 * i -1; j++) {
				if (i == 6 || j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print('\n');
		}
	}
}