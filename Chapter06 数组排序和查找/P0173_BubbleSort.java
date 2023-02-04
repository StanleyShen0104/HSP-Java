public class P0173_BubbleSort {
	public static void main(String[] args) {
		
		/*	
			数组删元素
			询问用户是否需要继续删
			当只剩一个元素时自动停止
			j:		0 	0 	0	0 		0
			i:		0 	1	2 	3 		4
			a[i-1]:	-	24	69 	57(80) 	13(57)
			a[i]:	24	69	80	80(57)	57(13)
			temp:	24	69	80	80		80 		

			out:	24	69	80
		*/
		//int[] a = {24, 69, 80, 57, 13};
		int[] a = {24, 11, 6, 69, 69, 80, 57, 13};
		int temp;
		for (int j = 0; j < a.length - 1; j++ ) {
			//每一轮排序
			temp = a[0];
			for (int i = 1; i < a.length - j; i++) {
				if (a[i] < a[i - 1]) {
					a[i - 1] = a[i];
					a[i] = temp;			
				}
				temp = a[i];
			}
			for (int k = 0; k < a.length; k++) {
				System.out.print(a[k] + " ");
			}
			System.out.println("");
			System.out.println("以上是第" + (j + 1) + "轮冒泡结果");
			System.out.println("-------------------");
			System.out.println("");
		}
		
		
	}	
}