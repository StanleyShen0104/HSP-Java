public class Recursion01 {
	public static void main(String[] args) {
		Tools t = new Tools();
		int num = t.rabbit(7);
		System.out.println(num);
	}
}

class Tools {
	public int rabbit(int n) {
		if (n <= 2) {
			return 1;
		}
		else {
			return rabbit(n - 1) + rabbit(n - 2);
		}
	}
}