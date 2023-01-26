public class P0074_RelationalEx1 {
	public static void main(String[] args) {
		// ex1
		int x=5,y=5;
		if(x++ == 6 & ++y == 6) { 
		//x++==5 !=6,x=6, ++y=6,f&t=f
			x = 11;
		}
		System.out.println("x=" + x + "y=" + y);
		//x=6, y=6

		x=5;
		y=5;
		if(x++ == 6 && ++y == 6) { 
		//x++==5 !=6,x=6, no after,f&&?=f
			x = 11;
		}
		System.out.println("x=" + x + "y=" + y);
		//x=6, y=5
		
		x=5;
		y=5;
		if(x++ == 5 | ++y == 5) { 
		//x++==5 ,x=6, y=++y=6!=5, t|f=t,x=11
			x = 11;
		}
		System.out.println("x=" + x + "y=" + y);
		//x=11, y=6

		x=5;
		y=5;
		if(x++ == 5 || ++y == 5) { 
		//x++==5 ,x=6, noafter, t||?=t,x=11
			x = 11;
		}
		System.out.println("x=" + x + "y=" + y);
		//x=11, y=5
	}	
}