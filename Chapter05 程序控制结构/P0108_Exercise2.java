public class P0108_Exercise2 {
	public static void main(String[] args) {
		
		/*
			定义int变量，判断之和是否能被3和5同时整除
		*/
		int i1 = 30;
		int i2 = 0;
		int sum = i1 + i2;

		if (sum % 3 == 0 && sum % 5 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}	
}