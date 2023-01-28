public class P0079_TernaryOperatorsEx1 {
	public static void main(String[] args) {
		/*
			寻找三者最大值
		*/
		int a = 3, b = 8, c = 10;
		int temp = a > b ? a : b;
		int max = temp > c ? temp : c;
		System.out.println(max);
	}	
}