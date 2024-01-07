public class ChapterExercise01 {
	public static void main(String[] args) {
		A01 r1 = new A01();
		double[] arr = {1, 2, 3};
		System.out.println(r1.max(arr));
		
		A02 r2 = new A02();
		String[] strArr = {"AA", "BB", "CC"};
		System.out.println(r2.find(strArr, "DD"));
		
		Book r3 = new Book(99.5);
		r3.updatePrice();
	}
}

class A01 {
	double num;
	public double max(double[] arr) {
		num = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > num) {
				num = arr[i];
			}
		}
		return num;
	}
}

class A02 {
	public int find(String[] arr, String str) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				return i;
			}
		}
		return -1;
	}
}

class Book {
	double price;
	public Book(double p) {
		this.price = p;
		System.out.println("orgin price:" + p);
	}
	public void updatePrice() {
		if (price > 150) {
			this.price = 150;
		}
		else if (price > 100) {
			this.price = 100;
		}
		System.out.println("modified price:" + this.price);
	}
}