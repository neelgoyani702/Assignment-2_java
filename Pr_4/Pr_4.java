public class Pr_4 {
	// Main method
	public static void main(String[] args) {
		// Create Account, SavingsAccount and Checking Account objects
		Account account = new Account(1, 20000);
		SavingsAccount savings = new SavingsAccount(2, 10000);
		CheckingAccount checking = new CheckingAccount(3, 20000, -50);

		// Set annual interest rate of 4.5%
		account.setAnnualInterestRate(5);
		savings.setAnnualInterestRate(5);
		checking.setAnnualInterestRate(5);

		// Withdraw 2,500 Rs
		account.withdraw(2500);
		savings.withdraw(2000);
		checking.withdraw(2500);

		// Deposit 3,000 Rs
		account.deposit(3000);
		savings.deposit(3000);
		checking.deposit(3000);

		// Invoke toString methods
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}