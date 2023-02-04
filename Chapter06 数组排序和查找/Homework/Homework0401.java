public class Homework0401 {
	public static void main(String[] args) {
		
		/*	
			ÉıĞòÊı×é{10,12,45,90} ²åÈë23 ÒÀ¾ÉÉıĞò
		*/
		//À©Èİ+Ã°Åİ
		int[] a = {10,12,45,90};
		int[] b = new int[a.length + 1];
		int buffer = 0;
		for (int i = 0; i < b.length; i++) {
			if (i == b.length - 1) {
				b[i] = 23;
			} else {
				b[i] = a[i];
			}
		}
		a = b;

		int temp = a[0];
		for (int j = 0; j < a.length - 1; j++) {
			temp = a[0];
			for (int k = 1; k < a.length - j; k++) {
				if (a[k] < a[k-1]) {
					a[k-1] = a[k];
					a[k] = temp;
				}
				temp = a[k];
			}
		}

		for (int m = 0; m < a.length; m++) {
			System.out.print(a[m] + " ");
		}
	
		
	}			
}