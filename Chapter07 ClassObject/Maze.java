public class Maze{
	public static void main(String[] args) {
		MyMaze mm = new MyMaze();
		int[][] map = mm.genMaze();
		int[] start = {1, 1}; 
		mm.stepMove(map, start);
	}
}

class MyMaze {
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
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		return m;
	}
	
	public void draw(int[][] map, int[] pos) {
		System.out.println("--------------");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (pos[0] == i && pos[1] == j) {
					System.out.print("* ");
				}
				else {
					System.out.print(map[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public void stepMove(int[][] map, int[] pos) {
		draw(map, pos);
		if (pos[0] == 6 && pos[1] == 5) {
			System.out.println("At last. Arrived!");
		}
		else {
			if(map[pos[0] + 1][pos[1]] != 1) {
				pos[0] += 1;
			}
			else if (map[pos[0]][pos[1] + 1] != 1) {
				pos[1] += 1;
			}
			stepMove(map, pos);
		}
	}
	
	
}