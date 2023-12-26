public class Recursion02 {
	public static void main(String[] args) {
		Tools t = new Tools();
		System.out.println(t.monkey(10));
	}
}

class Tools {
	public int monkey(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return 2*(monkey(n - 1) + 1);
		}
	}
}