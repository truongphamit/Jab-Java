public class AccountTest {
	public static void main(String[] args) {
		Account account1 = new Account("14020502", 0);
		Account account2 = new Account("14020503", 0);
		
		account1.deposit(10000);
		account1.withdraw(5000);
		account1.printAccount();
		account1.transfer(account2, 3000);
		account1.transfer(account2, 3000);
		account1.printAccount();
		account2.printAccount();
	}
}
