public class P0076_AssignOperators {
	public static void main(String[] args) {
		/*
			a+=b -> a=a+b
			+= -= *= /= %=
			
			*赋值运算符可能隐含强制转换
			 byte a+=1 => a = byte(a + 1) 
		*/
		int n1 = 10;
		n1 += 4;//n1=14
		System.out.println(n1);
		n1 /= 3;//n1=14/3=4
		System.out.println(n1);

	}	
}