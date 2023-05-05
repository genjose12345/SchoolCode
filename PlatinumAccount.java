package example_person_accounts_array;

public class PlatinumAccount extends GoldAccount {
	public PlatinumAccount(String name, double balance, double interestRate) {
		super(name,balance,interestRate);
	}

	@Override
	public void endOfMonth() {
		if(balance>0.0)
			balance *= (1.0+interestRate);
	}

	@Override
	public String toString() {
		return String.format("Platinum: Name:%s, bal:$%,.2f, int rate:%.2f", name, balance, interestRate);
	}
}
