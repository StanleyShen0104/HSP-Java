public class Array {
	public static void main(String[] args) {
		//1 A-Z
		char[] alpha = new char[26];
		for (int i = 0; i < 26; i++  ) {
			alpha[i] = (char)(i + 'A');
			System.out.print(alpha[i]);
		}
		
		//2 max number index
		int[] ques = {4, -1, 9, 10, 23};
		int max = ques[0], maxIndex = 0;
		for (int i = 1; i < ques.length; i++) {
			if (ques[i] > max) {
				max = ques[i];
				maxIndex = i;
			}
		}
		System.out.println();
		System.out.println("max value:" + max + "\t" + "index:" + maxIndex);
		
	}
}