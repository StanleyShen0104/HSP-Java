package homework08;

public class CheckingAccount extends BankAccount {
	private int freedep = 3;
	private int freewit = 3;

	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if (this.freedep > 0) {
			this.freedep -= 1;
			super.deposit(amount);
			System.out.println("free deposit remains:" + freedep);
		} else {
			super.deposit(amount - 1);
		}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (this.freewit > 0) {
			this.freewit -= 1;
			super.withdraw(amount);
			System.out.println("free withdraw remains:" + freewit);
		} else {
			super.withdraw(amount + 1);
		}
	}

	public int getFreedep() {
		return freedep;
	}

	public void setFreedep(int freedep) {
		this.freedep = freedep;
	}

	public int getFreewit() {
		return freewit;
	}

	public void setFreewit(int freewit) {
		this.freewit = freewit;
	}
}
