public class P0079_TernaryOperatorsEx1 {
	public static void main(String[] args) {
		/*
			find the max value of three numbers
		*/
		int a = 3, b = 8, c = 10;
		int temp = a > b ? a : b;
		int max = temp > c ? temp : c;
		System.out.println(max);
	}	
}