public class P0047_CharDetails {
	public static void main(String[] args) {
	
		/*
			Java��char�ı�����һ�����ֱ��룬ͨ�����������ʾ��Ӧ���ַ���
			����ͨ��(int)charname�����ַ�ǿתΪ���� 

			char�������Ϳ���ֱ�ӱ���Ϊ���ֲ�����㣬��Stringȴ����
			����ת��Ϊchar����ʱ����ʹ��ASCII���

			ASCIIһ������128���ַ���ÿ���ַ�1�ֽڡ�ʵ����������256���ַ�����
			ֻʹ����128��
			
			Unicodeÿ���ַ�2�ֽڡ��������ģ�������ַ������������������ԣ�����
			Ϊ�̶��ַ�ռ�ã��������

			utf-8������Unicode��������, ��ĸ1�ֽ�, ����3�ֽ�   

			GBK������ĸ1�ֽ�, ����2�ֽ�   
		*/
		char c1 = 'a';
		char c2 = 97;
		System.out.println(c1);		
		System.out.println((int)c2);	
		System.out.println('a' + 10);//'a'�ַ���ASCII��Ϊ97, ���ASCII��107���ַ�	
	}
}