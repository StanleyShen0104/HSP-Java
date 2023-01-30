public class P0135_MultipleCycleEx1 {
	public static void main(String[] args) {
		/*
			¥Ú”°99≥À∑®±Ì
		*/
		int i = 1;
		int j = 1;
		for (; i <= 9; i++) {
			j = 1;
			while (j <= i) {
				System.out.print(j + " * " + i + " = " + (i * j) + "\t");
				j++;
			}
			System.out.println("\n");
		}

	}
}
