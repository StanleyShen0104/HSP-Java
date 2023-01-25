public class P0052_AutoConvertDetails {
	public static void main(String[] args) {
		/*
			In java, when multiple data type mix in calculation, 
			java will do these: 
				1.automatically convert all type to the max capacity type
				2.do the calculation
		*/

		/*
			char/byte/short CANNOT auto-convert to each others

			When byte & short & char are mixed in calculation,Java will automatically
			convert all type to int at first
			example:	short + byte = int
						byte + byte = int
		*/

		/*
			boolean CANNOT auto-convert to any other type
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