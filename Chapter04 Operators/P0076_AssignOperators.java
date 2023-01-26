public class P0076_AssignOperators {
	public static void main(String[] args) {
		/*
			a+=b -> a=a+b
			+= -= *= /= %=
			
			*AssignOperators may imply a force-convert
			 byte a+=1 => a = byte(a + 1) 
		*/
		int n1 = 10;
		n1 += 4;//n1=14
		System.out.println(n1);
		n1 /= 3;//n1=14/3=4
		System.out.println(n1);

	}	
}