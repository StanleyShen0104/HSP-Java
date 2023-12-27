public class Hanoi {
	public static void main(String[] args) {
		Tower t = new Tower();
		t.move(3, "A", "B", "C");

	}
}

class Tower {
	public void move(int n , String a,  String b,  String c) {
		if (n == 1) {
			System.out.println(a + " >> " + c);
		}
		else {
			move(n - 1, a, c, b); //as a whole
			System.out.println(a + " >> " + c);
			move(n - 1, b, a, c);
		}
	}
}