package example_person_accounts_array;

public class BasicAccountTest {

	public static void main(String[] args) {
		basicAccountConstructor1Test();
		basicAccountConstructor2Test();
		depositTest();
		withdrawTest();
		depositAndWithdrawTest();		
		applyInterestTest();
		endOfMonthTest_PositiveBalance();		
		endOfMonthTest_NegativeBalance();
		endOfMonthTest_BalanceGoesNegative();	//	
	}
	
	private static void basicAccountConstructor1Test() {
		System.out.println("basicAccountConstructor1Test()");		
		BasicAccount ba = new BasicAccount("Dave", 1000.0);
		System.out.println(ba);
	}

	private static void basicAccountConstructor2Test() {
		System.out.println("\nbasicAccountConstructor2Test()");		
		BasicAccount ba = new BasicAccount("Dave");
		System.out.println(ba);
	}

	private static void depositTest() {
		System.out.println("\ndepositTest()");		
		BasicAccount ba = new BasicAccount("Dave");
		System.out.println("Before deposit of $500.00");
		System.out.println("-->" + ba);
		ba.deposit(500.0);
		System.out.println("After deposit of $500.00");
		System.out.println("-->" + ba);
		ba.deposit(1500.0);
		System.out.println("After deposit of $1500.00");
		System.out.println("-->" + ba);
	}

	private static void withdrawTest() {
		System.out.println("\nwithdrawTest()");		
		BasicAccount ba = new BasicAccount("Dave", 1000.0);
		System.out.println("Before withdraw of $200.00");
		System.out.println("-->" + ba);
		ba.withdraw(200.0);
		System.out.println("After withdraw of $200.00");
		System.out.println("-->" + ba);
		ba.withdraw(300.0);
		System.out.println("After withdraw of $300.00");
		System.out.println("-->" + ba);
	}

	private static void depositAndWithdrawTest() {
		System.out.println("\ndepositAndWithdrawTest()");		
		BasicAccount ba = new BasicAccount("Dave", 1000.0);
		System.out.println("Before withdraw of $200.00");
		System.out.println("-->" + ba);
		ba.withdraw(200.0);
		System.out.println("After withdraw of $200.00");
		System.out.println("-->" + ba);
		System.out.println("Deposit $1200.00");
		ba.deposit(1200.0);
		System.out.println("After deposit of $12s00.00");
		System.out.println("-->" + ba);
	}

	private static void applyInterestTest() {
		System.out.println("\napplyInterestTest()");		
		BasicAccount ba = new BasicAccount("Dave", 1000.0);
		System.out.println("Before applyInterest");
		System.out.println("-->" + ba);
		ba.applyInterest();
		System.out.println("After applyInterest, expecting $1050.00");
		System.out.println("-->" + ba);
	}

	private static void endOfMonthTest_PositiveBalance() {
		System.out.println("\nendOfMonthTest_PositiveBalance()");		
		BasicAccount ba = new BasicAccount("Dave", 1000.0);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + ba);
		ba.endOfMonth();
		System.out.println("After endOfMonth, expecting $995.00");
		System.out.println("-->" + ba);
	}

	private static void endOfMonthTest_NegativeBalance() {
		System.out.println("\nendOfMonthTest_NegativeBalance()");		
		BasicAccount ba = new BasicAccount("Dave", 1000.0);
		ba.withdraw(1100.00);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + ba);
		ba.endOfMonth();
		System.out.println("After endOfMonth, expecting -$130.00");
		System.out.println("-->" + ba);
	}

	private static void endOfMonthTest_BalanceGoesNegative() {
		System.out.println("\nendOfMonthTest_BalanceGoesNegative()");		
		BasicAccount ba = new BasicAccount("Dave", 1000.0);
		ba.withdraw(999.00);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + ba);
		ba.endOfMonth();
		System.out.println("After endOfMonth, expecting -$29.00");
		System.out.println("-->" + ba);
	}

}
