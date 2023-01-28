public class P0052_AutoConvertDetails {
	public static void main(String[] args) {
		/*
			在java中，多种不同数据类型混合参与计算时 
			java会自动执行以下操作: 
				1.先自动将所有数据类型，自动转化为最高精度类型
				2.再做运算，输出结果也为最高精度类型
		*/

		/*
			char/byte/short三者不能自动转化，因此当三者混合参与计算时，
			即使是自己加自己，java会将char/byte/short数据类型全部自动
			转换为int，计算结果也是int类型
			example:	short + byte = int
						byte + byte = int
		*/

		/*
			boolean 无法自动转化为其他任意类型
		*/
		
		int n1 = 10;
		double d1 = n1 + 1.1;//int -> double + double
		float f1 = n1 + 1.1f;//int -> float + float
		System.out.println(d1);
		System.out.println(f1);

		byte b1 = 1;
		short s1 = 2;
		int i1 = b1 + s1;//byte -> int, short -> int
	}
}