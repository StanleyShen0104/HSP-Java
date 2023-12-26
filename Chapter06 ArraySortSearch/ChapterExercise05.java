import java.util.Random;

public class ChapterExercise05 {
	public static void main(String[] args) {
		/*	rnd 1-100 10
		 *	reverse print
		 *	sum average
		 *	max and its index
		 *	find 8
		*/
		
		//genr rnd array and print
		Random rd = new Random();
		int[] rnd = new int[10];
		for (int i = 0; i < rnd.length; i++) {
			rnd[i] = rd.nextInt(100) + 1;
		}
		int []rndClone = rnd.clone(); 
		for (int i = 0; i < 10; i++) {
			System.out.print(rndClone[i] + "\t");	
			}
		System.out.println();
		
		
		//bubble sort reverse and print
		int temp;
		for (int i = 0; i < 9; i ++) {
			for (int j = 1; j < 10 - i; j++) {
				if(rnd[j - 1] < rnd[j]) {
					temp = rnd[j];
					rnd[j] = rnd[j - 1];
					rnd[j - 1] = temp;
				}
			}
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(rnd[i] + "\t");
		}
		System.out.println();
		
		//sum avg
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 10; i++) {
			sum += rndClone[i];
		}
		avg = sum / 10.0;
		System.out.println("Sum=" + sum + "\nAvg=" + avg);
		
		//max and its index
		int maxNum = rnd[0];
		for (int i = 0; i < 10; i++) {
			if (rndClone[i] == maxNum) {
				System.out.println("Max Number:" + maxNum + "\tIndex:" + i);
				break;
			}
		}
		
		//find 8
		for (int i = 0; i < 10; i++) {
			if (rndClone[i] == 8) {
				System.out.println("8 exsist\tIndex:" + i);
				break;
			}
			else if (rndClone[i] != 8 && i == 9) {
				System.out.println("8 doesn't exsist");
			}
		}
	}
}