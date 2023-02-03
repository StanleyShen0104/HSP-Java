public class P0156_Array {
	public static void main(String[] args) {
		
		double[] hens = {1.5,2.2,3.3,4.4,5.5,6.0};
		/*
		double hens[] = {1.5,2.2,3.3,4.4,5.5,6.0}; also ok
		double[] hens = new double[5];
		*/
		double sum = 0;
		for (int i = 0; i < hens.length; i++ ) {
			sum += hens[i];			
		}
		System.out.println(sum / hens.length);

	}	
}