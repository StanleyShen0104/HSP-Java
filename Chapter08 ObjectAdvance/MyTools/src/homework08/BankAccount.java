package homework08;

public class BankAccount {
	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
		System.out.println("Balance:" + this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Balance:" + this.balance);
	}

	public void withdraw(double amount) {
		this.balance -= amount;
		System.out.println("Balance:" + this.balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
