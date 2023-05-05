package example_person_accounts_array;

public class GoldAccountTest {

	public static void main(String[] args) {
		goldAccountConstructor1Test();
		goldAccountConstructor2Test();
		applyInterestTest_CustomInterestRate();
		applyInterestTest_DefaultInterestRate();
		endOfMonthTest_PositiveBalance();		
		endOfMonthTest_NegativeBalance();
	}
	
	private static void goldAccountConstructor1Test() {
		System.out.println("goldAccountConstructor1Test()");		
		GoldAccount ga = new GoldAccount("Dave", 1000.0, 0.10);
		System.out.println(ga);
	}

	private static void goldAccountConstructor2Test() {
		System.out.println("\ngoldAccountConstructor2Test()");		
		GoldAccount ga = new GoldAccount("Dave");
		System.out.println(ga);
	}

	private static void applyInterestTest_CustomInterestRate() {
		System.out.println("\napplyInterestTest_CustomInterestRate()");		
		GoldAccount ga = new GoldAccount("Dave", 1000.0, 0.10);
		System.out.println("Before applyInterest");
		System.out.println("-->" + ga);
		ga.applyInterest();
		System.out.println("After applyInterest, expecting $1100.00");
		System.out.println("-->" + ga);
	}

	private static void applyInterestTest_DefaultInterestRate() {
		System.out.println("\napplyInterestTest_DefaultInterestRate()");		
		GoldAccount ga = new GoldAccount("Dave");
		ga.deposit(1000.00);
		System.out.println("Before applyInterest");
		System.out.println("-->" + ga);
		ga.applyInterest();
		System.out.println("After applyInterest, expecting $1070.00");
		System.out.println("-->" + ga);
	}

	private static void endOfMonthTest_PositiveBalance() {
		System.out.println("\nendOfMonthTest_PositiveBalance()");		
		GoldAccount ga = new GoldAccount("Dave", 1000.0, 0.10);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + ga);
		ga.endOfMonth();
		System.out.println("After endOfMonth, expecting $1100.00");
		System.out.println("-->" + ga);
	}

	private static void endOfMonthTest_NegativeBalance() {
		System.out.println("\nendOfMonthTest_NegativeBalance()");		
		GoldAccount ga = new GoldAccount("Dave", 1000.0, 0.20);
		ga.withdraw(1100.00);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + ga);
		ga.endOfMonth();
		System.out.println("After endOfMonth, expecting -$110.00");
		System.out.println("-->" + ga);
	}
}
