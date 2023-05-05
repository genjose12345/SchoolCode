package example_person_accounts_array;

public class GoldAccount extends BasicAccount {
	protected double interestRate;

	public GoldAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}

	public GoldAccount(String name) {
		this(name, 0.0, 0.07);
	}

	public double getInterestRate() {
		return interestRate;
	}

	@Override
	public void applyInterest() {
		balance *= (1+interestRate);
	}

	@Override
	public void endOfMonth() {
		if(balance>0.0)
			balance *= (1.0+interestRate);
		else
			balance -= 10.0;
	}

	@Override
	public String toString() {
		return String.format("Gold: Name:%s, bal:$%,.2f, int rate:%.2f", name, balance, interestRate);
	}
}
