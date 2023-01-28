public class P0063_ArithmeticOperators {
	public static void main(String[] args) {
		/*
			使用除法时请注意
			10 / 4 是int / int，结果必为int类型，因此10 / 4 = 2
			如果需要精确答案，将整形转为double即可，10.0 / 4 = 2.5
		*/

		System.out.println(10.0 / 4);
		double d = 10 / 4;//int/int = 2, int->double=2.0
		System.out.println(d);

		/*
			java求余公式
			A为整数时：	A % B = A - A / B * B
			A为小数时：	A % B = A - (int)A / B * B
		*/
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-10-(-3)*3 = -1
		System.out.println(10 % -3);//10-(-3)*(-3) = 1
		System.out.println(-10 % -3);//-10-3*(-3) = -1

		/*
			自增注意事项
			b = a++, a先赋值给b，a再自增
			b = ++a, a先自增，再赋值给b
			a++ 与 ++a 本身没有区别
			
			*自增可能会导致数据类型强制转换
			byte a;
			a++ => a = byte(a + 1);

			a = a++ 的计算机操作流程
			1、temp = a
			2、a = a + 1
			3、a = temp

			a = ++a 的计算机操作流程
			1、a = a + 1
			2、temp = a
			3、a = temp
		*/

	}	
}