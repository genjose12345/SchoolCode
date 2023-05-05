package example_person_accounts_array;

public class BasicAccount {
	protected double balance;
	protected String name;

	public BasicAccount(String name, double balance) {
		this.balance = balance;
		this.name = name;
	}

	public BasicAccount(String name) {
		this(name, 0.0);
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public void applyInterest() {
		balance *= 1.05;
	}

	public void endOfMonth() {
		balance -= 5.0;
		if(balance<0.0)
			balance -= 25.0;
	}

	@Override
	public String toString() {
		return String.format("Basic: Name:%s, bal:$%,.2f", name, balance);
	}
}

