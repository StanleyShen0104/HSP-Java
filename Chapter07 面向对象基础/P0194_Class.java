public class P0194_Class {
	public static void main(String[] args) {
		
		/*	
			类中包含属性和方法
			类的定义本身，就是在java中创建一个新的自定义数据类型

			实例化，创建对象。语法：
			类名 对象名 = new 类名();

			或分步创建：
			类名 对象名;           此步在栈中生成名字指向，但地址是null
			对象名 = new 类名();	  此步在堆中开辟空间，并将地址返回给栈
			
			实例在栈中只存放名称和地址，地址指向堆中空间
			存放在堆中的属性值是一般数据类型
			但引用类型数据在堆中存入的是地址
			地址指向方法区中的存储空间

			比如String数据类型，他在堆中储存的地址最终指向方法区中的常量池中的某一个字符串
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