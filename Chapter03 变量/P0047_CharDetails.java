public class P0047_CharDetails {
	public static void main(String[] args) {
	
		/*
			Java中char的本质是一个数字编码，通过编码表来显示对应的字符，
			可以通过(int)charname来将字符强转为编码 

			char数据类型可以直接被视为数字参与计算，但String却不行
			数字转化为char类型时，将使用ASCII码表

			ASCII一共包含128个字符，每个字符1字节。实际上最大可有256个字符，但
			只使用了128个
			
			Unicode每个字符2字节。包括中文，日语等字符。极大地提高了普适性，但因
			为固定字符占用，不够灵活

			utf-8编码是Unicode升级而来, 字母1字节, 汉字3字节   

			GBK编码字母1字节, 汉字2字节   
		*/
		char c1 = 'a';
		char c2 = 97;
		System.out.println(c1);		
		System.out.println((int)c2);	
		System.out.println('a' + 10);//'a'字符的ASCII码为97, 输出ASCII码107的字符	
	}
}