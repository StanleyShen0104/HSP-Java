import java.util.Scanner;

public class ArrayAdd {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int addNum;
		String yn;
		Scanner mysc = new Scanner(System.in);
		label1:
		do {
			int[] arrAdd = new int[arr.length + 1];
			System.out.println("Your Number:");
			addNum = mysc.nextInt();
			for (int i = 0; i < arrAdd.length; i++) {
				if (i == arrAdd.length - 1) {
					arrAdd[i] = addNum;
				}
				else {
					arrAdd[i] = arr[i];
				}
				System.out.print(arrAdd[i]);
			}
			arr = arrAdd;
			System.out.println();
			do {
				System.out.println("Still Want to Add: y/n ?");
				yn = mysc.next();
				if ("y".equals(yn)) {
					break;
				}
				else if ("n".equals(yn)) {
					break label1;
				}
				System.out.println("Input Error");
			}while(true);
			if ("n".equals(yn)) {
				break;
			}
		}while(true);


	}
}