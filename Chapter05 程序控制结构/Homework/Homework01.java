public class Homework01 {
	public static void main(String[] args) {

		/*
			100000现金，交过路费，超过5w每次交5%，少于5w，每次交1000，能过多少次
		*/
		
		double money = 100000;
		int count = 0;
		while (true) {
			if (money > 50000) {
				money *= 0.95;
			} else if (money >= 1000) {
				money -= 1000;
			} else {
				break;
			}
			count++;
		}
		System.out.println("Totally:" + count);
	}
}
