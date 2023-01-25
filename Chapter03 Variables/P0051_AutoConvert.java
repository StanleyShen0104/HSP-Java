public class P0051_AutoConvert {
	public static void main(String[] args) {
		/*
			In java, lower precision vars type can be auto-convert to upper type
			
			Auto-Convert pathway:
							   char->int->long->float->double
						byte->short->int->long->float->double
		*/
		int n1 = 'a';//char -> int
		double d1 = 80;//int -> double
		System.out.println(n1); //97
		System.out.println(d1); //80.0
	}
}