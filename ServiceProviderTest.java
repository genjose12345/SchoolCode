package exercise_service_provider_cellular_accounts;

public class ServiceProviderTest {
	public static void main(String[] args) {
		
		testCreateServiceProviderAndAddAccount();
		testCreateServiceProviderAndAddMultipleAccounts();
		testCreateServiceProviderAndAddMoreThan10Accounts();
		testGetAccount_ValidLoc_10Accoutns();
		testGetAccount_InvalidLoc_10Accounts();
		testRemoveAccount_ValidLoc_5Accounts();
		testRemoveAccount_InvalidLoc_5Accounts();
		testRemoveMultipleAccounts();
		testGetAverageAmountDue();
		testGetAvergaeAmountDue_NoAmountDue();
		testGetAverageMinutesOverMax();
		testGetAverageMinutesOverMax_NoAccountsOverMax();
		testToString();
	}
	
	private static void testCreateServiceProviderAndAddAccount() {
		System.out.println("-->testCreateServiceProviderAndAddAccount()");
		ServiceProvider sp = new ServiceProvider();
		CellularAccount ca = new CellularAccount(500.0, 0.05);
		System.out.println("Expected: Num Accounts before addAccount() = 0");
		System.out.println("  Actual: Num Accounts before addAccount() = " + sp.getNumAccounts());
		
		//Adding ca to sp
		sp.addAccount(ca);
		System.out.println("Expected: Num Accounts after addAccount() = 1");
		System.out.println("  Actual: Num Accounts after addAccount() = " + sp.getNumAccounts());
	}
	
	private static void testCreateServiceProviderAndAddMultipleAccounts() {
		System.out.println("\n-->testCreateServiceProviderAndAddMultipleAccounts()");
		ServiceProvider sp = new ServiceProvider();
		CellularAccount ca1 = new CellularAccount(500.0, 0.05);
		CellularAccount ca2 = new DeluxeCellularAccount(500.0, 0.05, 100.0);
		System.out.println("Expected: Num Accounts before first addAccount() = 0");
		System.out.println("  Actual: Num Accounts before first addAccount() = " + sp.getNumAccounts());
		
		//Adding ca1 to sp
		sp.addAccount(ca1);
		System.out.println("Expected: Num Accounts after first addAccount() = 1");
		System.out.println("  Actual: Num Accounts after first addAccount() = " + sp.getNumAccounts());
		
		//Adding ca2 to sp
		sp.addAccount(ca2);
		System.out.println("Expected: Num Accounts after second addAccount() = 2");
		System.out.println("  Actual: Num Accounts after second addAccount() = " + sp.getNumAccounts());
	}
	
	private static void testCreateServiceProviderAndAddMoreThan10Accounts() {
		System.out.println("\n-->testCreateServiceProviderAndAddMoreThan10Accounts()");
		ServiceProvider sp = new ServiceProvider();
		CellularAccount[] accts = get10CellularAccounts();
		//Adding 10 Cellular Accounts to sp
		for(CellularAccount ca : accts) {
			sp.addAccount(ca);
		}
		System.out.println("Expected: Num Accounts = 10");
		System.out.println("  Actual: Num Accounts = " + sp.getNumAccounts());
		
		//Adding the 11th cellular account to sp
		sp.addAccount(new CellularAccount(700.0, 0.10));
		System.out.println("Expected: Num Accounts after adding the 11th account = 10");
		System.out.println("  Actual: Num Accounts after adding the 11th account = " + sp.getNumAccounts());
		
	}
	
	private static void testGetAccount_ValidLoc_10Accoutns() {
		System.out.println("\n-->testGetAccount_ValidLoc()");
		ServiceProvider sp = new ServiceProvider();
		CellularAccount[] accts = get10CellularAccounts();
		//Adding 10 Cellular Accounts to sp
		for(CellularAccount ca : accts) {
			sp.addAccount(ca);
		}
		
		int loc = 7;
		CellularAccount retrieved = sp.getAccount(loc);
		System.out.println("Expected: Amount Due=$0.00, Used=0.0 min., Max=1500.0 min., Cost Per Min=0.05");
		System.out.println("  Actual: " + retrieved);
	}
	
	private static void testGetAccount_InvalidLoc_10Accounts() {
		System.out.println("\n-->testGetAccount_InvalidLoc()");
		ServiceProvider sp = new ServiceProvider();
		CellularAccount[] accts = get10CellularAccounts();
		//Adding 10 Cellular Accounts to sp
		for(CellularAccount ca : accts) {
			sp.addAccount(ca);
		}
		
		int loc = -5;
		CellularAccount retrieved = sp.getAccount(loc);
		System.out.println("Expected: null");
		System.out.println("  Actual: " + retrieved);
	}
	
	private static void testRemoveAccount_ValidLoc_5Accounts() {
		System.out.println("\n-->testRemoveAccount_ValidLoc()");
		ServiceProvider sp = getServiceProvider_5Accounts();
		int loc = 2;
		System.out.println(String.format("Accounts before removeAccount(%d) ===>", loc));
		System.out.println(sp);
		
		//removing account
		sp.removeAccount(loc);
		System.out.println(String.format("Accounts after removeAccount(%d) ===>", loc));
		System.out.println(sp);
	}
	
	private static void testRemoveAccount_InvalidLoc_5Accounts() {
		System.out.println("\n-->testRemoveAccount_InvalidLoc()");
		ServiceProvider sp = getServiceProvider_5Accounts();
		int loc = 10;
		System.out.println(String.format("Accounts before removeAccount(%d) ===>", loc));
		System.out.println(sp);
		
		//removing account
		sp.removeAccount(loc);
		System.out.println(String.format("Accounts after removeAccount(%d) ===>", loc));
		System.out.println(sp);
	}
	
	private static void testRemoveMultipleAccounts() {
		System.out.println("\n-->testRemoveMultipleAccounts()");
		ServiceProvider sp = getServiceProvider_5Accounts();
		System.out.println(String.format("Accounts before removeAccount() ===>"));
		System.out.println(sp);
		
		//removing 2 accounts
		for(int i = 1; i < 5; i = i+2) {
			sp.removeAccount(i);
		}
		
		System.out.println(String.format("Accounts after removeAccount() ===>"));
		System.out.println(sp);
	}
	
	private static void testGetAverageAmountDue() {
		System.out.println("\n-->testGetAverageAmountDue()");
		ServiceProvider sp = getServiceProvider_5Accounts_AmountDue();
		
		//Average Amount Due = $2.90
		double aveAmountDue = sp.getAverageAmountDue();
		int numAccounts = sp.getNumAccounts();
		System.out.println("Expected: Average Amount Due for 5 accounts = $2.90");
		System.out.println(String.format("  Actual: Average Amount Due for %d accounts = $%.2f", numAccounts, aveAmountDue));
	}
	
	private static void testGetAvergaeAmountDue_NoAmountDue() {
		System.out.println("\n-->testGetAvergaeAmountDue_NoAmountDue()");
		ServiceProvider sp = getServiceProvider_5Accounts();
		
		//Average Amount Due = $0.00
		double aveAmountDue = sp.getAverageAmountDue();
		int numAccounts = sp.getNumAccounts();
		System.out.println("Expected: Average Amount Due for 5 accounts = $0.00");
		System.out.println(String.format("  Actual: Average Amount Due for %d accounts = $%.2f", numAccounts, aveAmountDue));
	}
	
	private static void testGetAverageMinutesOverMax() {
		System.out.println("\n-->testGetAverageMinutesOverMax()");
		ServiceProvider sp = getServiceProvider_5Accounts_MinutesMax();
		
		//Ave Max Minutes = 125
		double aveMinuteMax = sp.getAverageMinutesOverMax();
		System.out.println("Expected: Average Minutes Over Max = 150.0");
		System.out.println(String.format("  Actual: Average Minutes Over Max = %.1f", aveMinuteMax));
	}
	
	private static void testGetAverageMinutesOverMax_NoAccountsOverMax() {
		System.out.println("\n-->testGetAverageMinutesOverMax_NoAccountsOverMax()");
		ServiceProvider sp = getServiceProvider_5Accounts();
		
		//MinutesOverMax = 0.0
		double aveMinuteMax = sp.getAverageMinutesOverMax();
		System.out.println("Expected: Average Minutes Over Max = 0.0");
		System.out.println(String.format("  Actual: Average Minutes Over Max = %.1f", aveMinuteMax));
	}
	
	private static void testToString() {
		System.out.println("\n-->testToString()");
		ServiceProvider sp = getServiceProvider_5Accounts();
		System.out.println(sp.toString());
	}
	
	
	
	
	/**
	 * Helpers
	 */
	
	private static CellularAccount[] get10CellularAccounts() {
		CellularAccount[] accts = {
				new CellularAccount(500.0, 0.05),
				new DeluxeCellularAccount(500.0, 0.05, 100.0),
				new CellularAccount(500.0, 0.10),
				new DeluxeCellularAccount(700.0, 0.05, 150.0),
				new CellularAccount(500.0, 0.07),
				new DeluxeCellularAccount(500.0, 0.10, 100.0),
				new CellularAccount(800.0, 0.03),
				new DeluxeCellularAccount(1500.0, 0.05, 200.0),
				new CellularAccount(500.0, 0.05),
				new DeluxeCellularAccount(500.0, 0.05, 100.0)
		};
		return accts;
	}
	
	private static ServiceProvider getServiceProvider_5Accounts() {
		CellularAccount[] accts = {
				new CellularAccount(500.0, 0.05),
				new DeluxeCellularAccount(500.0, 0.05, 100.0),
				new CellularAccount(1500.0, 0.10),
				new DeluxeCellularAccount(700.0, 0.05, 150.0),
				new CellularAccount(500.0, 0.07)
		};
		
		ServiceProvider sp = new ServiceProvider();
		//Adding 5 Cellular Accounts to sp
		for(CellularAccount ca : accts) {
			sp.addAccount(ca);
		}
		return sp;
	}
	
	private static ServiceProvider getServiceProvider_5Accounts_AmountDue() {
		CellularAccount[] accts = {
				new CellularAccount(500.0, 0.05),
				new DeluxeCellularAccount(500.0, 0.05, 100.0),
				new CellularAccount(1500.0, 0.10),
				new DeluxeCellularAccount(700.0, 0.05, 150.0),
				new CellularAccount(500.0, 0.07)
		};
		
		accts[0].makeCall(100.0); //$5
		accts[1].makeCall(55.0); //$0
		accts[2].makeCall(70.0); //$7
		accts[3].makeCall(200.0); //$2.5
		
		ServiceProvider sp = new ServiceProvider();
		//Adding 5 Cellular Accounts to sp
		for(CellularAccount ca : accts) {
			sp.addAccount(ca);
		}
		return sp;
	}
	
	private static ServiceProvider getServiceProvider_5Accounts_MinutesMax() {
		CellularAccount[] accts = {
				new CellularAccount(500.0, 0.05),
				new DeluxeCellularAccount(500.0, 0.05, 100.0),
				new CellularAccount(1500.0, 0.10),
				new DeluxeCellularAccount(700.0, 0.05, 150.0),
				new CellularAccount(500.0, 0.07)
		};
		
		accts[0].makeCall(600.0); //100
		accts[1].makeCall(550.0); //0
		accts[2].makeCall(700.0); //0
		accts[3].makeCall(1000.0); //150
		accts[4].makeCall(700.0); //200
		
		ServiceProvider sp = new ServiceProvider();
		//Adding 5 Cellular Accounts to sp
		for(CellularAccount ca : accts) {
			sp.addAccount(ca);
		}
		return sp;
	}
}
