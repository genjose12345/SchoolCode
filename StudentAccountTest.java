package example_person_accounts_array;

public class StudentAccountTest {

	public static void main(String[] args) {
		studentAccountConstructor1Test();
		studentAccountConstructor2Test();
		endOfMonthTest_PositiveBalance();		
		endOfMonthTest_NegativeBalance();
	}
	
	private static void studentAccountConstructor1Test() {
		System.out.println("studentAccountConstructor1Test()");		
		StudentAccount sa = new StudentAccount("Dave", 1000.0);
		System.out.println(sa);
	}

	private static void studentAccountConstructor2Test() {
		System.out.println("\nstudentAccountConstructor2Test()");		
		StudentAccount sa = new StudentAccount("Dave");
		System.out.println(sa);
	}

	private static void endOfMonthTest_PositiveBalance() {
		System.out.println("\nendOfMonthTest_PositiveBalance()");		
		StudentAccount sa = new StudentAccount("Dave", 1000.0);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + sa);
		sa.endOfMonth();
		System.out.println("After endOfMonth, expecting $1000.00");
		System.out.println("-->" + sa);
	}

	private static void endOfMonthTest_NegativeBalance() {
		System.out.println("\nendOfMonthTest_NegativeBalance()");		
		StudentAccount sa = new StudentAccount("Dave", 1000.0);
		sa.withdraw(1100.00);
		System.out.println("Before endOfMonth");
		System.out.println("-->" + sa);
		sa.endOfMonth();
		System.out.println("After endOfMonth, expecting -$110.00");
		System.out.println("-->" + sa);
	}

}
