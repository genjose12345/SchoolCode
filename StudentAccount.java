package example_person_accounts_array;

public class StudentAccount extends BasicAccount {
	public StudentAccount(String name, double balance) {
		super(name, balance);
	}

	public StudentAccount(String name) {
		this(name, 0.0);
	}

	@Override
	public void endOfMonth() {
		if(balance<0.0)
			balance -= 10.0;
	}

	@Override
	public String toString() {
		return String.format("Student: bal=$%,.2f", balance);
	}
}
