public class P0038_Plus {
	public static void main(String[] args) {
		
		System.out.println(100 + 98);
		System.out.println("100" + 98);
		System.out.println(100 + 98 + "2");
		System.out.println("100" + 98 + 2);

		/*
			纯数值相加，为求和
			可加项中有一个字符串，最终会变为字符串拼接
			从左往右相加，数字先相加，直到遇见字符串
		*/
	}
}