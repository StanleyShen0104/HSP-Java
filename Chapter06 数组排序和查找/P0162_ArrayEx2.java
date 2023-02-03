public class P0161_ArrayEx2 {
	public static void main(String[] args) {
		
		//求int数组的最大值以及对应下标
		int[] a = {4, -1, 23, 10, 9};
		int max = a[0];
		int index = 0;

		for (int i = 1; i < a.length; i++) {
			if(a[i] > a[i-1]) {
				max = a[i];
				index = i;
			}
		}
		System.out.println("value:"+max+" index:"+index);
	}	
}