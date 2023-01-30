public class P0141_BreakDetail {
	public static void main(String[] args) {

		/*
			break label，跳出到指定label
			实际使用中，尽量不要用标签
		*/
		int count = 0;
		int num = 0;
		lab:
		while (true) {
			num = (int)(Math.random() * 100) + 1;
			if (num == 97) {
				break lab;
			}
			count += 1;

		}
		//从这里继续执行
		System.out.println("Tried:" + count);
	}
}
