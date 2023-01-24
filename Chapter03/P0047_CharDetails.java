public class P0047_CharDetails {
	public static void main(String[] args) {
	
		/*
			In java, the very nature of char is a number
			You can convert a char into number by (int)charname 

			char type can be calculated as number, But string CANNOT
			when a number convert to a char , ASCII/Unicode will be used

			ASCII have 128 elements, each elements required 1 byte,
			max 256 but only 128 in used
			
			Unicode each elements required 2 bytes.Chinese, Japanese...

			utf-8 is upgraded from unicode, alphabet 1 byte, kanji 3 bytes   

			GBK alphabet 1 byte, kanji 2 bytes   
		*/
		char c1 = 'a';
		char c2 = 97;
		System.out.println(c1);		
		System.out.println((int)c2);	
		System.out.println('a' + 10);//'a' is char as 97, equals to 107	
	}
}