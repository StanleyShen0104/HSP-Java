public class TwoDArray {
	public static void main(String[] args) {
		//Yang Hui Triangle 10rows
		int[][] arr = new int[10][];
		for (int i = 0; i < 10; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if(j == 0 || j == i) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i-1][j];
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}