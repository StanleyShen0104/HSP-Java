public class P0167_ArrayReverse {
	public static void main(String[] args) {
		
		/*	
			翻转数组
		*/
		int[] a = {66, 55, 44, 33, 22, 11};
		int[] b = new int[a.length];
		for (int i = 0; i < a.length ;i++) {
			b[i] = a[a.length - i - 1];
			System.out.println(b[i]);
		}
	}	
}