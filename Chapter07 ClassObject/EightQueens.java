//EightQueens.java
public class EightQueens {
	public static void main(String[] args) {
		//8 chess cannot same row col line, each row col line only can be one 
		Chess c = new Chess();
		c.solve(0);
	}	
}

class Chess {
	int[] queen = new int[8];
	int count;
	
	public void solve(int row) {
		/*	
		 *	int []queenArr;
		 *	i->queen's rowIndex;
		 *	queenArr[i]->queen's column Index
		 *
		 *	4 keys recursion situation:
		 *		1.vaild -> next row recursion
		 *		2.vaild -> next row reach limit -> exit recursion, not exit method
		 *		3.invaild -> next column recursion
		 *		4.invaild -> column iteration all invalid; ->column loop end, exit recursion
		 */
		
		//PS: recursion exit always code first
		//row == 8 out of index range
		if (row == 8) {
			draw();
			count++;
			return;
		}
		
		for (int col = 0; col < 8; col++) {
			if (isPass(row, col)) {
				queen[row] = col;
				solve(row + 1);
			}
		}
	}
	
	public void draw() {
		String str =  (count < 10) ? "0"+count: Integer.toString(count);
		System.out.println("---Drawing" + str + "---");
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (j == queen[i]) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public boolean isPass(int row, int col) {
		//	i < row is necessary. otherwise, there will be always return false
		for (int i = 0; i < row; i++) {
			/*
			 *	Invaild judgement:
			 * 
			 * 		---	---	---	0,3		
			 * 		1,0	---	---	---
			 * 		---	2,1	---	---
			 * 		3,0	---	3,2	---
			 * 
			 *		1.same columns -> columnIndex are same
			 *		2.same left slash -> columnIndex - rowIndex are same
			 *		3.same right slash -> columnIndex + rowIndex are same
			 */
			if(col == queen[i] || col - row == queen[i] - i || col + row == queen[i] + i) {
				return false;
			}
		}
		return true;
	}
}




