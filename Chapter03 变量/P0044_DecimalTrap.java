public class P0044_DecimalTrap {
	public static void main(String[] args) {
	
		/*
			小数之间的运算是近似的过程，不是精确过程
			比如当小数参与除法计算后，不要使用精确判断，应使用模糊判断 
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