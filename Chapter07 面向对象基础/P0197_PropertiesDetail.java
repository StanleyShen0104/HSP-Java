public class P0197_PropertiesDetail {
	public static void main(String[] args) {
		
		/*	
			访问修饰符：共四种
			public、protected、private、默认什么都不写

			成员变量如果在定义时不赋值，也有默认值，规则跟之前变量的默认值一样
			char:\u0000 boolean:false String:null 其他:0
			
			当对象被生成时，
			1、在方法区中先加载类信息，只会在首个对象出现时加载1次，不会重复加载
			2、在堆中分配空间，进行默认初始化。把空间地址返回给栈
			3、进行指定初始化

		*/

		Cat c1 = new Cat();
		c1.name = "小白";
		c1.color = "白色";
		c1.age = 3;
		c1.master = new String[3];
		c1.master[0] = "竟然";
		c1.master[1] = "可以";
		c1.master[2] = "通过";
		System.out.print(c1.name + " " + c1.color + " " + c1.age + "岁");
		System.out.println();
		System.out.print(c1.master[0] + c1.master[1] + c1.master[2]);
	}
}

class Cat { //定义类

	//声明类属性 也叫成员变量，有的人也叫字段
	String name;
	String color;
	int age;
	String[] master;//可以使基本数据类型，也可以是引用类型
}