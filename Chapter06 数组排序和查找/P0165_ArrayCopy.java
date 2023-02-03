public class P0165_ArrayCopy {
	public static void main(String[] args) {
		
		/*	
			两步走:
			1、使用new开启新的数据空间，同时形成了新地址
			2、遍历原数组将值复制过来
		*/
		int[] a = {1, 2, 3};
		int[] b = new int[a.length];
		for (int i = 0; i < a.length ;i++) {
			b[i] = a[i];
		}
	}	
}