public class P0051_AutoConvert {
	public static void main(String[] args) {
		/*
			java中，低精度类型可自动转化为高精度类型，但反之不行
			
			自动转换路径:
						char->int->long->float->double
				 byte->short->int->long->float->double
		*/
		int n1 = 'a';//char -> int
		double d1 = 80;//int -> double
		System.out.println(n1); //97
		System.out.println(d1); //80.0
	}
}