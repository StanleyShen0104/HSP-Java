public class P0086_Binary {
	public static void main(String[] args) {
		
		/*
			2 -> 10: sum(num*2^(position-1))
			8 -> 10: sum(num*8^(position-1))
			16 -> 10: sum(num*16^(position-1))
		*/

		/*
			10 -> 2: a % 2 save the remainder,
			until the last dividend < 2
			then reverse the remainder sequence
			34/2 = 17...0
			17/2 = 8 ...1
			8/2  = 4 ...0
			4/2  = 2 ...0
			2/2  = 1 ...0
			1<2  >>0B100010 1byte=8bits =>0B00100010

			10 -> 8: a % 8 save the remainder,
			until the last dividend < 8
			then reverse the remainder sequence
			131/8 = 16...3
			16/8  = 2 ...0
			2<8   >>0203

			10 -> 16: a % 16 save the remainder,
			until the last dividend < 16
			then reverse the remainder sequence
			237/16 = 14...13
			14<16   >>0X(14)(13)>>0XED
		*/

		/* 2 -> 8: from the lower position 3 numbers
		   a group, convert each group to 8
		   11010101->11(010)(101)->325->0325

		   2 -> 16: from the lower position 4 numbers
		   a group, convert each group to 16
		   11010101->(1101)(0101)->(13)5->0XD5
		*/
		/*
		   8 -> 2:every number in 8, convert to 3 numbers
		   binary
		   0237->(0)(2)(3)(7)->(0)(010)(011)(111)
		   0b010011111

		   16 -> 2:every number in 16, convert to 4 numbers
		   binary
		   0X23B->(2)(3)(11)->(0010)(0011)(1011)->
		   0b001000111011
		*/
		int n1 = 0b1010;//2
		int n2 = 1010;//10
		int n3 = 01010;//8
		int n4 = 0X10101;//16
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}
}