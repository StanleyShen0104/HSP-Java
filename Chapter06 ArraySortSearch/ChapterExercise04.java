import java.util.Scanner;

public class ChapterExercise04 {
	public static void main(String[] args) {
		//non-bubble sort
		int[] arr = {10, 12, 45, 90};
		int[] arrtemp = new int[arr.length + 1];
		Scanner mysc = new Scanner(System.in);
		System.out.println("in put your number:");
		int num = mysc.nextInt();
		boolean trigger = true;
		for (int i = 0, j = 0; i < arrtemp.length; i++, j++) {
			if (i == arrtemp.length - 1 && trigger) {
				arrtemp[i] = num;
			}
			else if (num < arr[j] && trigger) {
				arrtemp[i] = num;
				j -= 1;
				trigger = false;
			}
			else {
				arrtemp[i] = arr[j];
			}
		}
		arr = arrtemp;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}