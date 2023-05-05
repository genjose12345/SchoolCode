package exercise_corporation_salesreport_arraylist;

public class SalesReport {
	protected String companyName;
	protected double[] salesData;
	
	public SalesReport(String companyName, double[] salesData) {
		this.companyName = companyName;
		this.salesData = salesData;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public String getReport() {
		String report = getHeader() + "\n" + getBody();
		return report;
	}
	
	protected String getHeader() {
		return "Aggregate Sales Report for " + companyName;
	}
	
	protected String getBody() {
		String body = String.format("The average sales is $%,.2f", averageSales());
		return body;
	}

	public double averageSales() {
		double avg = 0.0;
		for(double sales : salesData)
			avg += sales;
		avg /= salesData.length;
		return avg;
	}
}
