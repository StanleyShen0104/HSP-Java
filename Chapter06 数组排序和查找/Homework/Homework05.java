public class Homework05 {
	public static void main(String[] args) {
		
		/*	
			随机生成10个整数数组1-100，倒叙打印，并算出平均值，求最大值和其下标，并查找链是否有8
		*/
		//扩容+定位
		int[] a = new int[10];
		int[] ori = new int[10];
		//生成数组
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(100 * Math.random()) + 1;
			ori[i] = a[i];
			System.out.print(a[i] + " ");
		}
		System.out.println();

		//冒泡倒叙
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			temp = a[0];
			for (int j = 1; j < a.length - i; j++) {
				if (a[j-1] < a[j]) {
					a[j-1] = a[j];
					a[j] = temp;
				}
				temp = a[j];
			}
		}

		//计算值
		int maxnum = a[0];
		int indexmax = -1;
		String indexeight = "不包含";
		int sum = 0;
		boolean haveeight;
		for (int i = 0; i < ori.length; i++) {
			//倒叙打印
			System.out.print(a[i]+" ");
			sum += ori[i];
			if (ori[i] == 8) {
				haveeight = true;
				indexeight = "包含";
			} else if (ori[i] == maxnum) {
				indexmax = i;
			}
		}
		System.out.println();
		System.out.print("最大值是" + maxnum + " 其下标是" + indexmax 
			+ " 平均值是" + (sum/10.0) + " " + indexeight + "数字8");	
	}			
}