package homework08;

public class SavingAccount extends CheckingAccount {
	private double interest = 0.01;

	public SavingAccount(double initialBalance) {
		super(initialBalance);
	}

	public void earnMonthlyInterest() {
		super.setBalance(super.getBalance() * (1 + this.interest));
		super.setFreedep(3);
		super.setFreewit(3);
		System.out.println("Interests in Account Free service reset");
	}
}
