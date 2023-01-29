public class P0130_DoWhile {
	public static void main(String[] args) {
		/*
			do{
				code;
				i++；
			} while(condition);   注意有分号
			先执行，后判断
		*/
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 10);

	}
}
