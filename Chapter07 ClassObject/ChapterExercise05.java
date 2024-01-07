public class ChapterExercise05 {
	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject po = new PassObject();
		po.printAreas(c, 5);
	}
}

class Circle {
	private double radius;
	public double findArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	public void setR(double n) {
		this.radius = n;
	}
}

class PassObject {
	public void printAreas(Circle c, int times) {
		System.out.println("Radius\tArea");
		double area;
		for (int i = 1; i <= times; i++) {
			c.setR(i);
			area = c.findArea();
			System.out.println(i + "\t" + area);
		}
	}
}