public class P0046_Char {
	public static void main(String[] args) {
	
		/*
			char = 2 bytes
			char could be a kanji, a number, or a \x
		*/
		char c1 = 'a';
		char c2 = '\t';
		char c3 = 'Ñó';
		char c4 = 100;
		System.out.println(c1);		
		System.out.println(c2);		
		System.out.println(c3);		
		System.out.println(c4);		
	}
}