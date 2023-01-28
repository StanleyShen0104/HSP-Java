public class P0077_TernaryOperators {
	public static void main(String[] args) {
		/*
			int a = 条件句? 真执行句:假执行句;
		*/
		int a = 10, b=99;
		int result = a > b ? a++ : b--;
		System.out.println(result);//99
		System.out.println(b);//98
	}	
}