public class P0063_ArithmeticOperators {
	public static void main(String[] args) {
		/*
			Caution in division /
			10 / 4 is int / int = int, so answer is 2
			if need accurate answer, convert int to double：
			10.0 / 4 = double
		*/

		System.out.println(10.0 / 4);
		double d = 10 / 4;//int/int = 2, int->double=2.0
		System.out.println(d);

		/*
			Caution in mod %
			A % B = A - A / B * B	
		*/
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-10-(-3)*3 = -1
		System.out.println(10 % -3);//10-(-3)*(-3) = 1
		System.out.println(-10 % -3);//-10-3*(-3) = -1

		/*
			Caution in self-increase
			b = a++, b = a first, then a self-increase
			b = ++a, a self-increase first, then b = a
			a++ == ++a
			but if assignment b, there will be different
			*self-increase may imply a force-convert
			 byte a;
			 a++ => a = byte(a + 1);
		*/

	}	
}