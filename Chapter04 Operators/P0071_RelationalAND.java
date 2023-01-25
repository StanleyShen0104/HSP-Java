public class P0071_RelationalAND {
	public static void main(String[] args) {
		/*
			&& is short AND, when the first condition is false,
			the after condition will NOT be executed.

			& is logical AND, when the first condition is false,
			the after condition will STILL be executed.

			&& is more frequency in common project
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