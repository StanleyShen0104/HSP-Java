public class P0181_TDAEx1 {
	public static void main(String[] args) {
		
		/*	
			遍历二维数组并求和
		*/
		int[][] a = {{4,6},{1,4,5,7},{-2}};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		System.out.println(sum);
	}
}