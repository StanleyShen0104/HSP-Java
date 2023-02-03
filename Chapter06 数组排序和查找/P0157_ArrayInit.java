public class P0157_ArrayInit {
	public static void main(String[] args) {
		
		//第一种动态分配方式		
		double[] scores1 = new double[5];

		//第二种动态分配方式
		double[] scores2;//声明了一个null数组，没有分配内存空间
		scores2 = new double[5];//给该数组分配了内存空间，才可以存放数据

		//静态初始化
		double[] scores3 = {1,2.0,3,4};//注意，静态初始化时输入的数据必须是可自动类型转换的

		/*
			可以放基本数据类型，也可以放引用类型。但同一个array中两者不能混用
			数组分配内存空间后，有默认值基本都是0，char是\u000，boolean是false，String是null
			数组array是引用类型，因此数组的type是个对象object
		*/

	}	
}