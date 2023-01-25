public class P0020_EscapeCharacter {
	public static void main(String[] args) {
		// \t:制表位，实现对齐
		System.out.println("A\tB\tC");
		
		// \n:换行符
		System.out.println("A\nB");

		// \\:一个\,数量倍数2n
		System.out.println("A\\B");

		// \":一个"
		System.out.println("A\"B\"C");

		// \":一个'
		System.out.println("A\'B\'C");

		// \r:回车，回首行替换。若配合\n则不替换
		System.out.println("ABCDEF\rG");

		//课堂练习
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");

	}

}