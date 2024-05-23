package homework08;

public class Homework08 {
	public static void main(String[] args) {
		BankAccount acc = new SavingAccount(100000);
		acc.deposit(100);
		acc.deposit(100);
		acc.deposit(100);
		acc.deposit(100);
		acc.deposit(100);

		acc.withdraw(50);
		acc.withdraw(50);
		acc.withdraw(50);
		acc.withdraw(50);
		acc.withdraw(50);
		((SavingAccount)acc).earnMonthlyInterest();
	}
}
