public class Homework04 {
	public static void main(String[] args) {
		/*
			1.将string转double
			2.将char转string
		*/
		String a = "123";
		Double b = Double.parseDouble(a);
		System.out.println(b);

		char c = 'c';
		String d = c + "";
		System.out.println(d);

	}
}