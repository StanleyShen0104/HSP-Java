package oopEdition;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangesSysOOP {
	// 属性
	private boolean loop = true;
	private double balance = 0;
	private double money = 0;
	// 消费项目名称
	private String choice = "";
	private String name;
	private String walletdetails = "--------------------零钱通明细--------------------";
	private char yn;
	private Date dt = null;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	private Scanner mysc = new Scanner(System.in);

	public void showmenu() {
		System.out.println();
		do {
			System.out.println("===============零钱通菜单===============");
			System.out.println("\t\t\t1 零钱通明细");
			System.out.println("\t\t\t2 收益入账");
			System.out.println("\t\t\t3 消费");
			System.out.println("\t\t\t4 退出");
			System.out.print("请选择(1-4):"); // 因为后续不想换行
			this.choice = mysc.next();
			switch (this.choice) {
			case "1":
				this.detail();
				break;
			case "2":
				this.income();
				break;
			case "3":
				this.cost();
				break;
			case "4":
				this.exit();
				break;
			default:
				System.out.println("输入有误");
			}
		} while (this.loop);
	}

	public void detail() {
		System.out.println(this.walletdetails);
	}

	public void income() {
		System.out.println("--------------------收益入账---------------------");
		do {
			System.out.print("请输入收入金额：");
			this.money = this.mysc.nextDouble();
			if (this.money <= 0) {
				System.out.println("收入金额有误！");
			} else {
				// 入账金额符合逻辑，则打印该入账条目
				this.dt = new Date();
				System.out.println("入账成功!\n入账金额:" + this.money + "\t入账时间:" + this.sdf.format(dt));
				// 使钱包明细字符串换行拼接
				this.balance += this.money;
				this.walletdetails += "\n收益入账\t+" + this.money + "\t" + this.sdf.format(dt) + "\t余额:" + this.balance;
				break;
			}
		} while (true);
	}

	public void cost() {
		System.out.println("----------------------消费-----------------------");
		do {
			System.out.print("请输入消费项目：");
			this.name = this.mysc.next();
			System.out.print("请输入消费金额：");
			this.money = this.mysc.nextDouble();
			if (this.money <= 0) {
				System.out.println("消费金额有误！");
			} else if (this.balance - this.money < 0) {
				System.out.println("余额不足！");
			} else {
				this.dt = new Date();
				System.out.println("消费成功!\n消费项目:" + this.name + "\t消费金额:" + this.money + "\t" + this.sdf.format(dt));
				this.balance -= this.money;
				this.walletdetails += "\n" + this.name + "\t-" + this.money + "\t" + this.sdf.format(dt) + "\t余额:" + this.balance;
				break;
			}
		} while (true);
	}

	public void exit() {
		do {
			System.out.print("是否真的要退出？y/n: ");
			this.yn = this.mysc.next().charAt(0);
			if (this.yn == 'y') {
				this.loop = false;
				System.out.println("===============退出零钱通===============");
				break;
			}
			else if (this.yn == 'n') {
				break;
			}
			System.out.println("输入的信息有误！");
		}while (true);
	}

}
