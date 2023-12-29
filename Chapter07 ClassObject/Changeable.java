public class Changeable {
	public static void main(String[] args) {
		Method m = new Method();
		m.showScore("Li Lei", 99.1, 80.5, 71);
	}
}

class Method {
	public void showScore(String name, double... score) {
		double s = 0;
		for (int i = 0; i < score.length; i++) {
			s += score[i];
		}
		System.out.println(name);
		System.out.println(score.length + " subjects total point: "+ s);
	}
}