public class P0069_RelationalOperators {
	public static void main(String[] args) {

		/*
			关系运算符包括 > >= < <= == != isinstanceof
		*/
		int a = 9;
		int b = 8;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		boolean flag = a > b;
		System.out.println(flag);
	}	
}