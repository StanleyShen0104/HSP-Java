public class P0064_SelfIncreaseTrap {
	public static void main(String[] args) {

		/*
			赋值行为本质:
			通过中间变量实现
		*/
		int i = 1;
		i = i++;//1)temp = i  2)i=i+1=2 3)i=temp
		System.out.println(i);//i=1

		int j = 1;
		j = ++j;//1)j=j+1=2  2)temp=j=2 3)j=temp=2
		System.out.println(j);//j=2


	}	
}