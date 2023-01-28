public class P0072_RelationalOR {
	public static void main(String[] args) {
		/*
			||短路或，识别到true则后续判断语句不执行

			| 逻辑或，全部识别

			短路或更常用，效率高
		*/

		int a = 10;
		int b = 4;

		if(a < 12 || ++b < 10) {
		}
		System.out.println("a=" + a + "  b=" + b);

		if(a < 12 | ++b < 10) {
		}
		System.out.println("a=" + a + "  b=" + b);
	}	
}