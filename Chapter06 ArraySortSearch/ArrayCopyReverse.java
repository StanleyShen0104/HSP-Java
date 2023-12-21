public class ArrayCopyReverse {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arrCopy = new int[arr.length];
		int[] arrReverse = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrCopy[i] = arr[i];
			System.out.print(arrCopy[i]);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			arrReverse[i] = arr[arr.length - 1 - i];
			System.out.print(arrReverse[i]);
		}
	}
}