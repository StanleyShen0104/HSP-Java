import java.util.Scanner;
public class P0176_TwoDimensionArray {
	public static void main(String[] args) {
		
		/*	
			ถþฮฌสýื้
		*/
		int[][] a = { {1,2},
					  {0,1},
					  {1,1}, 
					  {1,2} };
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}