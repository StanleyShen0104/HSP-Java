public class ForLoop{
	public static void main(String[] args) {
		//print 1-100 which 9x
		int count = 0, sum = 0;
		for (int i = 1; i <=100; i++) {
			if (i % 9 == 0) {
				count++;
				sum += i;
			}
		}
		System.out.println("count="+count+"\tsum="+sum);
		
		//print 0+5=5;...5+0=5;
		for (int i=0; i <= 5; i++) {
			System.out.println(i + " + " + (5 - i) + " = 5");
		}
	}
}