public class OverLoad {
	public static void main(String[] args) {
		Methods m1 = new Methods();
		m1.m(3);
		m1.m(3, 2);
		m1.m("yes");
		System.out.println(m1.max(1, 2));
		System.out.println(m1.max(1.1, 2.1));
		System.out.println(m1.max(1.1, 2.1, 3));
	}
}

class Methods {
	public int m(int n) {
		int r = n * n;
		System.out.println(r);
		return r;
	}
	
	public int m(int n1, int n2) {
		int r = n1 * n2;
		System.out.println(r);
		return r;
	}
	
	public void m(String s) {
		System.out.println(s);
	}
	
	public int max(int n1, int n2) {
		return n1 > n2 ? n1: n2;
	}
	
	public double max(double n1, double n2) {
		return n1 > n2 ? n1: n2;
	}
	
	public double max(double n1, double n2, double n3) {
		return n1 > max(n2, n3) ? n1: max(n2, n3);
	}
}
