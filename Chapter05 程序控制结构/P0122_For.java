public class P0122_For {
	public static void main(String[] args) {
		/*
			for(循环变量初始化;循环条件;循环变量迭代) {
				循环执行语句
			} 
			自增发生在循环执行句完成之后

			初始化可以写在for外面，以便升级为全局变量使用
			自增可以写在循环执行语句下面，

			可以有多个变量初始化，多个自增
		*/
			for(int i = 1; i <= 10; i++) {
				System.out.println("for loop" + i);
			}

			int j = 1;//初始化全局化
			for(;j <= 10;) {
				j++;//自增
			}

			for(;;) { //无限循环
				break;
			}
	}
}
