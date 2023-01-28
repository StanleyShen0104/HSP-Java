public class P0071_RelationalAND {
	public static void main(String[] args) {
		/*
			&&短路与，识别到false则后续判断语句不执行

			&逻辑与，判断句全部识别

			短路与更常用，效率高
		*/

		int a = 10;
		int b = 4;

		if(a > 12 && ++b < 10) {
		}
		System.out.println("a=" + a + "  b=" + b);

		if(a > 12 & ++b < 10) {
		}
		System.out.println("a=" + a + "  b=" + b);
	}	
}