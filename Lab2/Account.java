public class Account {
	private String accountNumber;
	private double balance;

	public Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void printAccount() {
		System.out.println("Account name: " + accountNumber);
		System.out.println("Balance: " + balance);
	}

	public void transfer(Account account, double amount) {
		if (balance >= amount) {
			this.withdraw(amount);
			account.deposit(amount);
			System.out.println("Transfering done!");
		} else {
			System.out.println("Balance less than " + amount);
		}
	}
}
