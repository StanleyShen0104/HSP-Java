public class P0043_DecimalDetails {
	public static void main(String[] args) {
	
		/*
			float = 4 bytes
			double = 8 bytes
			java default decimal is double, such as 1.1(double) 

			float a = 1.1 will cause a error, can't make 8bytes->4bytes
			float a = 1.1f can solve the problem
			double a = 1.1f also fine, 4bytes->8bytes
		*/
		double n1 = .123;
		float n2 = 1.1f;
		double n3 = 5.12E-2;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3); 
	}
}