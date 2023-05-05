package exercise_cellular_account;

public class TestDeluxeCellularAccount {

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
		DeluxeCellularAccount dca = new DeluxeCellularAccount(500.0, 0.05, 100.0);
		System.out.println("Expected: Amount Due=$0.00, Used=0.0 min., Max=500.0 min., Cost Per Min=0.05");
		System.out.println("  Actual: " + dca);
	}
	
	private static void testMakeCall() {
		System.out.println("\n-->testMakeCall()");
		DeluxeCellularAccount dca = new DeluxeCellularAccount(500.0, 0.05, 100.0);
		dca.makeCall(50.0);
		System.out.println("Expected: Amount Due=$0.00, Used=50.0 min., Max=500.0 min., Cost Per Min=0.05");
		System.out.println("  Actual: " + dca);
	}
	
	private static void testMakeMultipleCalls() {
		System.out.println("\n-->testMakeMultipleCalls()");
		DeluxeCellularAccount dca = new DeluxeCellularAccount(500.0, 0.05, 100.0);
		double call1 = 100.0;
		double call2 = 100.0;
		System.out.println("Making first call ===> ");
		dca.makeCall(call1);
		System.out.println("Expected after first call: Amount Due=$0.00, Used=100.0 min., Max=500.0 min., Cost Per Min=0.05");
		System.out.println("  Actual after first call: " + dca);
		System.out.println("\nMaking second call ===> ");
		dca.makeCall(call2);
		System.out.println("Expected after second call: Amount Due=$5.00, Used=200.0 min., Max=500.0 min., Cost Per Min=0.05");
		System.out.println("  Actual after second call: " + dca);
	}
	
	private static void testGetAmountDue() {
		System.out.println("\n-->testGetAmountDue()");
		DeluxeCellularAccount dca = new DeluxeCellularAccount(500.0, 0.05, 100.0);
		double call = 150.0;
		dca.makeCall(call);
		System.out.println(String.format("Making call ===> %.1f minutes long", call));
		System.out.println("Expected: Amount Due: $2.50");
		System.out.println(String.format("  Actual: Amount Due: $%.2f", dca.getAmountDue()));
	}
	
	private static void testGetAmountDue_MinutesOver() {
		System.out.println("\n-->testGetAmountDue_MinutesOver()");
		DeluxeCellularAccount dca = new DeluxeCellularAccount(500.0, 0.05, 100.0);
		double call1 = 200.0;
		double call2 = 150.0;
		double call3 = 150.0;
		double call4 = 100.0;
		System.out.println(String.format("Making first call ===> %.1f minutes long", call1));
		dca.makeCall(call1);
		
		System.out.println(String.format("\nMaking second call ===> %.1f minutes long", call2));
		dca.makeCall(call2);
		
		System.out.println(String.format("\nMaking third call ===> %.1f minutes long", call3));
		dca.makeCall(call3);
		
		System.out.println(String.format("\nMaking fourth call ===> %.1f minutes long", call4));
		dca.makeCall(call4);
		
		System.out.println("\nExpected: Max Minutes: 500.0, Minutes Used: 600.0, Amount Due: $26.00");
		System.out.println(String.format("  Actual: Max Minutes: %.1f, Minutes Used: %.1f, Amount Due: $%.2f",
										dca.getMinutesMax(), dca.getMinutesUsed(), dca.getAmountDue()));
	}
	
	private static void testToString() {
		System.out.println("\n-->testToString()");
		DeluxeCellularAccount dca = new DeluxeCellularAccount(500.0, 0.05, 100.0);
		double call1 = 83.50;
		double call2 = 79.60;
		System.out.println("Making first call ===> ");
		dca.makeCall(call1);
		System.out.println("Expected after first call: Amount Due=$0.00, Used=83.5 min., Max=500.0 min., Cost Per Min=0.05");
		System.out.println("  Actual after first call: " + dca.toString());
		System.out.println("\nMaking second call ===> ");
		dca.makeCall(call2);
		System.out.println("Expected after second call: Amount Due=$3.16, Used=163.1 min., Max=500.0 min., Cost Per Min=0.05");
		System.out.println("  Actual after second call: " + dca.toString());
	}
}
