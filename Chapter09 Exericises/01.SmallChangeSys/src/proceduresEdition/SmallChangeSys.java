package proceduresEdition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
	public static void main(String[] args) {

		// 1、显示菜单，选择菜单，给出相应提示
		boolean loop = true;
		double balance = 0;
		Scanner mysc = new Scanner(System.in);
		String choice = "";
		String walletdetails = "--------------------零钱通明细--------------------";
		do {
			System.out.println("===============零钱通菜单===============");
			System.out.println("\t\t\t1 零钱通明细");
			System.out.println("\t\t\t2 收益入账");
			System.out.println("\t\t\t3 消费");
			System.out.println("\t\t\t4 退出");
			System.out.print("请选择(1-4):"); // 因为后续不想换行
			choice = mysc.next();
			// 收益入账：金额，日期
			// 零钱通明细：金额，日期
			double money = 0;
			Date dt = null;
			// 消费项目名称
			String name;
			char yn;
			// 使用SDF类对日期格式初始化预备(需要记忆)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			switch (choice) {
			case "1":
				System.out.println(walletdetails);
				break;
			case "2":
				System.out.println("--------------------收益入账---------------------");
				// 使用scanner接收收入相关信息
				do {
					System.out.print("请输入收入金额：");
					money = mysc.nextDouble();
					if (money <= 0) {
						System.out.println("收入金额有误！");
					} else {
						// 入账金额符合逻辑，则打印该入账条目
						dt = new Date();
						System.out.println("入账成功!\n入账金额:" + money + "\t入账时间:" + sdf.format(dt));
						// 使钱包明细字符串换行拼接
						balance += money;
						walletdetails += "\n收益入账\t+" + money + "\t" + sdf.format(dt) + "\t余额:" + balance;
						break;
					}
				} while (true);
				break;
			case "3":
				System.out.println("----------------------消费-----------------------");
				do {
					System.out.print("请输入消费项目：");
					name = mysc.next();
					System.out.print("请输入消费金额：");
					money = mysc.nextDouble();
					if (money <= 0) {
						System.out.println("消费金额有误！");
					} else if (balance - money < 0) {
						System.out.println("余额不足！");
					} else {
						dt = new Date();
						System.out.println("消费成功!\n消费项目:" + name + "\t消费金额:" + money + "\t" + sdf.format(dt));
						balance -= money;
						walletdetails += "\n" + name + "\t-" + money + "\t" + sdf.format(dt) + "\t余额:" + balance;
						break;
					}
				} while (true);
				break;
			case "4":
				do {
					System.out.print("是否真的要退出？y/n: ");
					yn = mysc.next().charAt(0);
					if (yn == 'y') {
						loop = false;
						System.out.println("===============退出零钱通===============");
						break;
					}
					else if (yn == 'n') {
						break;
					}
					System.out.println("输入的信息有误！");
				}while (true);
				break;
			default:
				System.out.println("输入有误");
			}
		} while (loop);
	}
}
