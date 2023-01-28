public class P0073_RelationalNOTXOR {
	public static void main(String[] args) {
		/*
			非		！(True) = False
			异或		(True) ^ (False) = True
		*/
		System.out.println(true);
		System.out.println(!true);

		System.out.println(true ^ false);
		System.out.println(true ^ true);
	}	
}