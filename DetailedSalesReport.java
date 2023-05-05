package exercise_corporation_salesreport_arraylist;

public class DetailedSalesReport extends SalesReport {
	
	public DetailedSalesReport(String companyName, double[] salesData) {
		super(companyName,salesData);
	}
	
	public String getHeader() {
		return "Detailed Sales Report for " + getCompanyName();
	}
	
	public String getBody() {
		int numCompleteLines = salesData.length/5;
		int numInLastLine = salesData.length%5;
		StringBuilder body = new StringBuilder();
		body.append(String.format("The average sales is $%,.2f\n\n", averageSales()));
		body.append("All sales figures:\n");
		int i=0;
		for(int j=0; j<numCompleteLines; j++) {
			for(int k=0; k<5; k++) {
				body.append(String.format("$%,.2f ", salesData[i++]));
			}
			body.append("\n");
		}
		for(int j=0; j<numInLastLine; j++) {
			body.append(String.format("$%,.2f ", salesData[i++]));
		}
		return body.toString();
	}

}
