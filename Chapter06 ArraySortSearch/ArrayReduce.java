import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		int[] arr = {3, 5, 9, 11};
		Scanner mysc = new Scanner(System.in);
		label1:
		do {
			if(arr.length == 1) {
				System.out.println("only have 1 element: " +  arr[0]);
				break;
			}
			int[] arrReduce = new int[arr.length - 1];
			for (int i = 0; i < arrReduce.length; i++) {
				arrReduce[i] = arr[i];
				System.out.print(arrReduce[i]);
			}
			System.out.println();
			arr = arrReduce;
			do {
				System.out.println("Still Want to Reduce: y/n ?");
				String yn = mysc.next();
				if ("y".equals(yn)) {
					break;
				}
				else if ("n".equals(yn)) {
					break label1;
				}
				else {
					System.out.println("Input Error");
				}
			}while(true);
		}while(true);
	}
}