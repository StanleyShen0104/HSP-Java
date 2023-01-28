public class P0043_DecimalDetails {
	public static void main(String[] args) {
	
		/*
			float = 4 bytes
			double = 8 bytes
			java中默认小数为double, 比如1.1(double) 

			float a = 1.1 会引发错误，double无法自动降转float，因为8bytes->4bytes
			float a = 1.1f 则可以
			double a = 1.1f 触发了自动转换, 4bytes->8bytes
		*/
		double n1 = .123;
		float n2 = 1.1f;
		double n3 = 5.12E-2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3); 
	}
}