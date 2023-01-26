public class P0077_TernaryOperators {
	public static void main(String[] args) {
		/*
			int a = condition? truecode:falsecode;
		*/
		int a = 10, b=99;
		int result = a > b ? a++ : b--;
		System.out.println(result);//99
		System.out.println(b);//98
	}	
}