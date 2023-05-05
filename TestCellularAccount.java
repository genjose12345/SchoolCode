package exercise_cellular_account;

public class TestCellularAccount {

	public static void main(String[] args) {
		
		testAccountCreation();
		testMakeCall();
		testMakeMultipleCalls();
		testGetAmountDue();
		testGetAmountDue_MinutesOver();
		testToString();
	}
	
	private static void testAccountCreation() {
		System.out.println("-->testAccountCreation()");
		CellularAccount ca = new CellularAccount(200.0, 0.10);
		System.out.println("Expected: Amount Due=$0.00, Used=0.0 min., Max=200.0 min., Cost Per Min=0.10");
		System.out.println("  Actual: " + ca);
	}
	
	private static void testMakeCall() {
		System.out.println("\n-->testMakeCall()");
		CellularAccount ca = new CellularAccount(200.0, 0.10);
		ca.makeCall(60.0);
		System.out.println("Expected: Amount Due=$6.00, Used=60.0 min., Max=200.0 min., Cost Per Min=0.10");
		System.out.println("  Actual: " + ca);
	}
	
	private static void testMakeMultipleCalls() {
		System.out.println("\n-->testMakeMultipleCalls()");
		CellularAccount ca = new CellularAccount(200.0, 0.10);
		double call1 = 60.0;
		double call2 = 75.0;
		System.out.println("Making first call ===> ");
		ca.makeCall(call1);
		System.out.println("Expected after first call: Amount Due=$6.00, Used=60.0 min., Max=200.0 min., Cost Per Min=0.10");
		System.out.println("  Actual after first call: " + ca);
		System.out.println("\nMaking second call ===> ");
		ca.makeCall(call2);
		System.out.println("Expected after second call: Amount Due=$13.50, Used=135.0 min., Max=200.0 min., Cost Per Min=0.10");
		System.out.println("  Actual after second call: " + ca);
	}
	
	private static void testGetAmountDue() {
		System.out.println("\n-->testGetAmountDue()");
		CellularAccount ca = new CellularAccount(200.0, 0.10);
		ca.makeCall(150.0);
		System.out.println("Expected: Amount Due: $15.00");
		System.out.println(String.format("  Actual: Amount Due: $%.2f", ca.getAmountDue()));
	}
	
	private static void testGetAmountDue_MinutesOver() {
		System.out.println("\n-->testGetAmountDue_MinutesOver()");
		CellularAccount ca = new CellularAccount(200.0, 0.10);
		double call1 = 60.0;
		double call2 = 75.0;
		double call3 = 50.0;
		double call4 = 82.0;
		System.out.println(String.format("Making first call ===> %.1f minutes long", call1));
		ca.makeCall(call1);
		
		System.out.println(String.format("\nMaking second call ===> %.1f minutes long", call2));
		ca.makeCall(call2);
		
		System.out.println(String.format("\nMaking third call ===> %.1f minutes long", call3));
		ca.makeCall(call3);
		
		System.out.println(String.format("\nMaking fourth call ===> %.1f minutes long", call4));
		ca.makeCall(call4);
		
		System.out.println("\nExpected: Max Minutes: 200.0, Minutes Used: 267.0, Amount Due: $29.38");
		System.out.println(String.format("  Actual: Max Minutes: %.1f, Minutes Used: %.1f, Amount Due: $%.2f",
										ca.getMinutesMax(), ca.getMinutesUsed(), ca.getAmountDue()));
	}
	
	private static void testToString() {
		System.out.println("\n-->testToString()");
		CellularAccount ca = new CellularAccount(200.0, 0.10);
		double call1 = 83.50;
		double call2 = 79.60;
		System.out.println("Making first call ===> ");
		ca.makeCall(call1);
		System.out.println("Expected after first call: Amount Due=$8.35, Used=83.5 min., Max=200.0 min., Cost Per Min=0.10");
		System.out.println("  Actual after first call: " + ca.toString());
		System.out.println("\nMaking second call ===> ");
		ca.makeCall(call2);
		System.out.println("Expected after second call: Amount Due=$16.31, Used=163.1 min., Max=200.0 min., Cost Per Min=0.10");
		System.out.println("  Actual after second call: " + ca.toString());
	}
}
