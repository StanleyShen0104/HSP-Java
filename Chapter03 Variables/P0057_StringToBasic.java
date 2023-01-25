public class P0057_StringToBasic {
	public static void main(String[] args) {
		/*
			basic type to string just +""
			
			string to basic type such as,
			Double.parseDouble
			Long.parseLong.

			except string to char:
			stringname.charAt(0~n), return characters

		*/

		int i1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = i1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		String s5 = "123";
		double d2 = Double.parseDouble(s5);
		float f2 = Float.parseFloat(s5);
		long l2 = Long.parseLong(s5);
		int i2 = Integer.parseInt(s5);
		short s6 = Short.parseShort(s5);
		byte b2 = Byte.parseByte(s5);
		boolean x = Boolean.parseBoolean("true");
		char c2 = s5.charAt(0);

		System.out.println(d2);
		System.out.println(f2);
		System.out.println(l2);
		System.out.println(i2);
		System.out.println(s6);
		System.out.println(b2);
		System.out.println(x);
		System.out.println(c2);

	}	
}