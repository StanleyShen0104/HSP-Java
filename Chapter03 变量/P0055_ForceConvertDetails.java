public class P0055_ForceConvertDetails {
	public static void main(String[] args) {
		/*
			强制数据类型转换只作用于最近的数字
			因此可以使用()来提升整体的优先级
		*/

		int i1 = (int)(10 * 3.5 + 8 * 2.5);
		System.out.println(i1);
	}	
}