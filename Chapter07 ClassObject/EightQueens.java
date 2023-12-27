//EightQueens.java
public class EightQueens {
	public static void main(String[] args) {
		//8 chess cannot same row col line, each row col line only can be one 
		Chess c = new Chess();
		int[][] chess = c.genrMap();
		c.trying(chess, 0, 0);
		c.draw(chess);
	}
		
}

class Chess {
	public boolean trying(int[][] map , int x, int y) {
		//0 uncheck; 1 right place; 2 wrong place
		/*	
		 *	check
		 *	check y -> up iteration
		 *	check n -> 2 -> right iteration
		 *	
		 */
		//remain unsolved
	}
	
	public void draw(int[][] chess) {
		System.out.println("---Drawing---");
		for (int i = 0; i < chess.length; i++) {
			for (int j = 0; j < chess[i].length; j++) {
				System.out.print(chess[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public int[][] genrMap() {
		int[][] map = new int[8][8];
		return map;
	}
	
	public boolean isPass(int[][] map, int x, int y) {
		for (int i = 0; i < 8; i++) {
			//same row against rule
			if (map[x][i] == 1 && i != y) {
				return false;
			}
			//same colums against rule
			else if (map[i][y] == 1 && i != x) {
				return false;
			}
		}
		int buffer = 1;
		//up line against rule
		while(x + buffer < 8) {
			if (y + buffer < 8 && map[x + buffer][y + buffer] == 1) {
				return false;
			}
			if (y - buffer >= 0 && map[x + buffer][y - buffer] == 1) {
				return false;
			}
			buffer++;
		}
		
		buffer = 1; //reset buffer
		//down line against rule
		while(x - buffer >= 0) {
			if (y + buffer < 8 && map[x - buffer][y + buffer] == 1) {
				return false;
			}
			if (y - buffer >= 0 && map[x - buffer][y - buffer] == 1) {
				return false;
			}
			buffer++;
		}
		return true;
	}
}