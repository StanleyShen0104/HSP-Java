public class WhileLoop{
	public static void main(String[] arg) {
		//print 1-100 3
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		}
		// print 40-200 %2=0
		int j = 40;
		while (j <= 200) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
			j++;
		}
	}
}