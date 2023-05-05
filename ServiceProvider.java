package exercise_service_provider_cellular_accounts;

public class ServiceProvider {
	private CellularAccount[] accounts = new CellularAccount[10];
	private int numAccounts = 0;

	public ServiceProvider() {
	}
	
	public int getNumAccounts() {
		return numAccounts;
	}
	
	public void addAccount(CellularAccount a) {
		if(numAccounts<accounts.length) {
			accounts[numAccounts++] = a;
		}
	}

	public CellularAccount getAccount(int i) {
		if(i>=0 && i<numAccounts) {
			return accounts[i];
		}
		return null;
	}
	
	public CellularAccount removeAccount(int i) {
		if(i>=0 && i<numAccounts) {
			CellularAccount removedAccount = accounts[i];
			for(int j=i+1; j<numAccounts; j++) {
				accounts[j-1] = accounts[j];
			}
			numAccounts--;
		    return removedAccount;
		}
		return null;
	}
	
	/**
	 * This method returns the average amount due for all the accounts.
	 */
	public double getAverageAmountDue() {
		double ave = 0.0;
		for(int i = 0; i < numAccounts; i++) {
			ave += accounts[i].getAmountDue();
		}
		return ave / numAccounts;
	}
	
	/**
	 * This method  returns the average number of minutes used, but only for accounts where the minutes 
	 * used is above the max number of minutes for the account.
	 */
	public double getAverageMinutesOverMax() {
		double minOverMax = 0.0;
		int accountsOverMax = 0;
		
		for(int i = 0; i < numAccounts; i++) {
			double diff = 0.0;
			if(accounts[i] instanceof DeluxeCellularAccount) {
				DeluxeCellularAccount dca = (DeluxeCellularAccount)accounts[i];
				double minUsed = dca.getMinutesUsed() - dca.freeMinutes;
				double maxMins = dca.getMinutesMax();
				diff = minUsed - maxMins;
			} else {
				double minUsed = accounts[i].getMinutesUsed();
				double maxMins = accounts[i].getMinutesMax();
				diff = minUsed - maxMins;
			}
			
			if(diff > 0.0) {
				accountsOverMax++;
				minOverMax += diff;
			}
		}
		
		//This line of code makes sure the function does not return a NaN
		return accountsOverMax == 0 ? 0.0 : minOverMax/accountsOverMax;
	}

	@Override
	public String toString() {
		StringBuilder msg = new StringBuilder();
		msg.append("Account List\n");
		
		//Noel's note ==> can not assume the accounts 
		//array will be full all the time
//		for(CellularAccount a : accounts) {
//			msg.append(a.toString() + "\n");
//		}
		
		for(int i = 0; i < numAccounts; i++) {
			msg.append(String.format("%d. %s \n",
						(i+1), accounts[i].toString()));
		}
		return msg.toString();
	}
	
//	public DetailedSalesReport getReportLargestAverageSalesDetailed() {
//		// Returns the DetailedSalesReport that has the maximum average 
//		// sales value over only the Detailed reports
//		// Hint: instanceof is used, and casting required
//		// Write code here.
//		DetailedSalesReport dsrMax=null;
//		double max=Double.MAX_VALUE;
//		for(int i=0; i<numAccounts; i++) {
//			SalesReport r = accounts[i];
//			if(r instanceof DetailedSalesReport) {
//				if(r.averageSales() > max) {
//					max = r.averageSales();
//					dsrMax = (DetailedSalesReport)r;
//				}
//			}
//		}
//		return dsrMax;
//	}
//	
//	public double getLargestAverageSalesDetailed() {
//		// Returns the maximum average sales value over only the Detailed reports
//		// Hint: instanceof is used, but not casting
//		// Write code here.
//		double max=Double.MAX_VALUE;
//		for(int i=0; i<numAccounts; i++) {
//			SalesReport r = accounts[i];
//			if(r instanceof DetailedSalesReport) {
//				if(r.averageSales() > max) {
//					max = r.averageSales();
//				}
//			}
//		}
//		return max;
//	}
//	
//	public DetailedSalesReport[] getDetailedReports() {
//		// Returns an array of the DetailedSalesReports
//		// Write code here
//		DetailedSalesReport[] detailedReports = new DetailedSalesReport[getNumDetailedReports()];
//		int j=0;
//		for(int i=0; i<numAccounts; i++) {
//			SalesReport r = accounts[i];
//			if(r instanceof DetailedSalesReport) {
//				detailedReports[j++] = (DetailedSalesReport)r;
//			}
//		}
//		return detailedReports;
//	}
//	
//	// Helper method to return the number DetailedReports
//	private int getNumDetailedReports() {
//		int count=0;
//		for(int i=0; i<numAccounts; i++) {
//			if(accounts[i] instanceof DetailedSalesReport) {
//				count++;
//			}
//		}
//		return count;
//	}

}
