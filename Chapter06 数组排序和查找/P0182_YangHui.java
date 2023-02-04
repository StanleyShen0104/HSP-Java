public class P0182_YangHui {
	public static void main(String[] args) {
		
		/*	
			打印10行的杨辉三角
		*/
		int[][] a = new int[10][];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 0; j < a[i].length; j++) {
				if (j == 0 || j == a[i].length - 1) {
					a[i][j] = 1;
				} else if (i > 1) {
					a[i][j] = a[i-1][j] + a[i-1][j-1];
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}