public class P0161_ArrayEx1 {
	public static void main(String[] args) {
		
		//用数组和for循环生成A-Z		
		char[] agb = new char[26];

		for (int i = 0; i < agb.length; i++) {
			agb[i] = (char)('A' + i);
		}
		System.out.println(agb);
	}	
}