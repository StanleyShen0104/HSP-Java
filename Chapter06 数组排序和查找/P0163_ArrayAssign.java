public class P0163_ArrayAssign {
	public static void main(String[] args) {
		
		/*	
			n2 = n1;
			值拷贝：n2的变化不会影响到n1
			基本数据类型所赋的值就是具体的数值，所以不影响
			
			地址拷贝或引用拷贝：n2的变化会影响到n1
			数组是引用传递，赋值赋的其实是内存地址

			jvm内存中，分位栈、堆、方法区。
			基本数据类型赋值后本质上是在栈中指向一个具体的值
			引用数据类型赋值后是在栈中指向一个地址，这个地址实际位置是在堆中
		*/
		int[] a = {1, 2, 3};
		int[] b = a;
		b[0] = 10;
		System.out.println(a[0]);
	}	
}