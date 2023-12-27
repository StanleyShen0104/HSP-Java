public class Maze {
	public static void main(String[] args) {
		MyMaze mm = new MyMaze();
		mm.map = mm.genMaze();
		mm.stepMove(mm.map, 1, 1);
		mm.draw(mm.map);
	}
}

class MyMaze {
	int[][] map;
	
	public int[][] genMaze() {
		int[][] m = new int[8][7];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == 0 || i == 7 ||  j==0 || j == 6) {
					m[i][j] = 1;
				}
				else if (i == 3 && (j == 1 || j == 2)) {
					m[i][j] = 1;
				}
				else {
					m[i][j] = 0;
				}
			}
		}
		System.out.println("Map have already been generated.");
		return m;
	}
	
	
	public boolean stepMove(int[][] map, int x, int y) {
		/*	0 ready to go
		 * 	1 blocked
		 * 	2 good way
		 * 	3 dead way 
		*/
		if (map[6][5] == 2) {
			return true; //must be true; 
		}
		else {
			//down right up left
			if (map[x][y] == 0) {
				map[x][y] = 2;
				if (stepMove(map, x + 1, y)) {
					return true;
				}
				else if (stepMove(map, x, y + 1)) {
					return true;
				}
				else if (stepMove(map, x - 1, y)) {
					return true;
				}
				else if (stepMove(map, x, y - 1)) {
					return true;
				}
				else {
					map[x][y] = 3;
					return false;
				}
			}
			else {
				return false;
			}
		}
	}
	
	public void draw(int[][] map) {
		System.out.println("---Solution---");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}