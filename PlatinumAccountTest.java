package example_person_accounts_array;

public class PlatinumAccountTest {

	public static void main(String[] args) {
		platinumAccountConstructorTest();
		endOfMonthTest_PositiveBalance();		
		endOfMonthTest_NegativeBalance();
	}
	
	private static void platinumAccountConstructorTest() {
		System.out.println("platinumAccountConstructorTest()");		
		PlatinumAccount pa = new PlatinumAccount("Dave", 1000.0, 0.10);
		System.out.println(pa);
	}

	private static void endOfMonthTest_PositiveBalance() {
		System.out.println("\nendOfMonthTest_PositiveBalance()");		
		PlatinumAccount pa = new PlatinumAccount("Dave", 1000.0, 0.10);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + pa);
		pa.endOfMonth();
		System.out.println("After endOfMonth, expecting $1100.00");
		System.out.println("-->" + pa);
	}

	private static void endOfMonthTest_NegativeBalance() {
		System.out.println("\nendOfMonthTest_NegativeBalance()");		
		PlatinumAccount pa = new PlatinumAccount("Dave", 1000.0, 0.20);
		pa.withdraw(1100.00);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + pa);
		pa.endOfMonth();
		System.out.println("After endOfMonth, expecting -$100.00");
		System.out.println("-->" + pa);
	}
}
