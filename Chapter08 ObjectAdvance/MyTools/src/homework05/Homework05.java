package homework05;

public class Homework05 {
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];
		arr[0] = new Worker(1500);
		arr[1] = new Peasant(1200);
		arr[2] = new Waiter(1600);
		arr[3] = new Teacher(1000, 50, 200);
		arr[4] = new Scientist(1500, 20000);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].salary());
		}
	}
}
