package com.encapsulation;

public class Account {
	private String name;
	private double money;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 2 && name.length() <= 4) {
			this.name = name;
		} else {
			System.out.println("Invalid name");
			this.name = "Unknown";
		}
	}

	public Account(String name, double money, String password) {
		super();
		setName(name);
		setMoney(money);
		setPassword(password);
	}

	public Account() {
		super();
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if (money > 20) {
			this.money = money;
		} else {
			System.out.println("Invalid Money");
			this.money = 0;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() == 6) {
			this.password = password;
		} else {
			System.out.println("Invalid Password input");
			this.password = "123456";
		}
	}

	public void showInfo() {
		System.out.println("name:" + name + "\tmoney:" + money + "\tpassword:" + password);
	}

}
