package example_superclass_method_account_studentAccount;

public class AccountExample {

	public static void main(String[] args) {
		BasicAccount a = new StudentAccount(1000.0);
		a.withdraw(200.0);
		a.withdraw(100.0);
		System.out.println(a);

	}

}

class BasicAccount {
	private double balance;
	
	public BasicAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public String toString() {
		String msg = String.format("bal=$%,.2f", balance);
		return msg;
	}

}

class StudentAccount extends BasicAccount {
	int numWithdrawals;
	
	public StudentAccount(double balance) {
		super(balance);
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		numWithdrawals++;
	}

	@Override
	public String toString() {
		String msg = String.format("%s, num withdrawals=%d", super.toString(), numWithdrawals);
		return msg;
	}
}
