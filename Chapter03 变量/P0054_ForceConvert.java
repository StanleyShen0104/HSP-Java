public class P0054_ForceConvert {
	public static void main(String[] args) {
		/*
			注意，强制数据类型转换可能会导致以下两个问题:
			1.数据溢出，因字节数缩小而损失位信息
			2.精度损失，特别是小数位损失
			因此使用强转时应再三确认
		*/

		int i1 = (int)1.9;
		System.out.println(i1);//loss of precision

		int i2 = 2000;
		byte b1 = (byte)i2;
		System.out.println(b1);//data overflow

	}	
}