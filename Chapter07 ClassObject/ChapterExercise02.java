public class ChapterExercise02 {
	public static void main(String[] args) {
		double[] arr = {1, 2, 3, 4};
		A03 a03 = new A03();
		a03.draw(a03.copyArr(arr));
		Circle c = new Circle(1);
		Cale ca = new Cale(5 , 2);
		ca.sum();
		ca.minus();
		ca.multi();
		ca.divide();
	}
}

class A03 {
	public double[] copyArr(double[] arr) {
		double[] copy = new double[arr.length]; 
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
	
	public void draw(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}

class Circle {
	double rad, circle, s;
	public Circle(double rad) {
		this.rad = rad;
		this.circle = rad * 2 * Math.PI;
		this.s = Math.pow(rad, 2) * Math.PI;
		this.calculate();
	}
	
	public double[] calculate() {
		System.out.println("rectangle:" + this.circle);
		System.out.println("area:" + this.s);
		double[] r={this.circle, this.s};
		return r;
	}
}

class Cale {
	double n1, n2;
	public Cale(double n1, double n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void sum() {
		System.out.println("sum:" + (n1 + n2));
	}
	public void minus() {
		System.out.println("minus:" + (n1 - n2));
	}
	public void multi() {
		System.out.println("multi:" + (n1 * n2));
	}
	public void divide() {
		if (n2 == 0) {
			System.out.println("divider is 0, inf");
		}
		else {
			System.out.println("divide:" + (n1 / n2));
		}
	}
	
}