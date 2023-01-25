public class P0044_DecimalTrap {
	public static void main(String[] args) {
	
		/*
			Decimal calculation is an approximate process
			Couldn't get a accurate math result
			DO NOT compare two decimal which were calculated 
		*/
		double n1 = 8.1 / 3;
		double n2 = 2.7;
		System.out.println(n1);
		System.out.println(n2); 
		if (Math.abs(n1 - n2) <= 0.001) {
			System.out.println("Equal");
		}
	}
}