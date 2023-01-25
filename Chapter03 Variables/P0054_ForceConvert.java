public class P0054_ForceConvert {
	public static void main(String[] args) {
		/*
			Caution, ForceConvert may cause two problems:
			1.data overflow
			2.loss of precision
			So, be careful using FC 
		*/

		int i1 = (int)1.9;
		System.out.println(i1);//loss of precision

		int i2 = 2000;
		byte b1 = (byte)i2;
		System.out.println(b1);//data overflow

	}	
}