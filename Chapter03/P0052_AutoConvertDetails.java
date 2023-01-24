public class P0052_AutoConvertDetails {
	public static void main(String[] args) {
		/*
			In java, when multiple data type mix in calculation, 
			java will do these: 
				1.automatically convert all type to the max capacity type
				2.do the calculation

			char CANNOT auto-convert to byte/short,byte/short CANNOT auto-convert to char

		*/
		int n1 = 10;
		double d1 = n1 + 1.1;//int -> double + double
		float f1 = n1 + 1.1f;//int -> float + float
		System.out.println(d1);
		System.out.println(f1);
	}
}