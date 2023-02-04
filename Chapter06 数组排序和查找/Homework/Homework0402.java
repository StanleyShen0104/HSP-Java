public class Homework0402 {
	public static void main(String[] args) {
		
		/*	
			升序数组{10,12,45,90} 插入23 依旧升序
		*/
		//扩容+定位
		int[] a = {10,12,45,90};
		int[] b = new int[a.length + 1];
		int i = 0;
		for (; i < b.length; i++) {
			if (a[i] >= 23) {
				break; 
			}
		}

		for (int j = 0; j< b.length; j++) {
			if (j < i) {
				b[j] = a[j];
			} else if (j == i) {
				b[j] = 23;
			} else {
				b[j] = a[j - 1];
			}
			System.out.print(b[j] + " ");
		}
		a = b;
	}			
}