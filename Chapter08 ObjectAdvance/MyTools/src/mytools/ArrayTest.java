package mytools;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 3, 7, 5, 6 };
		MyTools mt = new MyTools();
		mt.show(arr);
		mt.BubbleSort(arr);
	}
}

class MyTools {
	public void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public void BubbleSort(int arr[]) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		show(arr);
	}
}
