public class P0138_Break {
	public static void main(String[] args) {

		/*
			break，跳出

			随机生成1-100的随机数，直到出现97，输出尝试了多少次
		*/
		int count = 0;
		int num = 0;
		while (true) {
			num = (int)(Math.random() * 100) + 1;
			if (num == 97) {
				break;
			}
			count += 1;

		}
		System.out.println("Tried:" + count);
	}
}
