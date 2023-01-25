public class P0072_RelationalOR {
	public static void main(String[] args) {
		/*
			|| is short OR, when the first condition is true,
			the after condition will NOT be executed.

			| is logical OR, when the first condition is true,
			the after condition will STILL be executed.

			|| is more frequency in common project
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