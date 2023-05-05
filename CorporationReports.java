package exercise_corporation_salesreport_arraylist;

import java.util.ArrayList;

public class CorporationReports {
	private ArrayList<SalesReport> reports = new ArrayList<>();

	public CorporationReports() {
	}
	
	public int getNumReports() {
		return reports.size();
	}
	
	public void addReport(SalesReport rpt) {
		reports.add(rpt);
	}
	
	public DetailedSalesReport getReportLargestAverageSalesDetailed() {
		// Returns the DetailedSalesReport that has the maximum average 
		// sales value over only the Detailed reports
		// Hint: instanceof is used, and casting required
		// Write code here.
		DetailedSalesReport dsrMax=null;
		
		//MAX_VALUE does not allow any averageSales() to be greater than max
//		double max=Double.MAX_VALUE; ---> original code
		double max = Double.MIN_VALUE;
		for(SalesReport r : reports) {
			if(r instanceof DetailedSalesReport) {
				if(r.averageSales() > max) {
					max = r.averageSales();
					dsrMax = (DetailedSalesReport)r;
				}
			}
		}
		return dsrMax;
	}
	
	public double getLargestAverageSalesDetailed() {
		// Returns the maximum average sales value over only the Detailed reports
		// Hint: instanceof is used, but not casting
		// Write code here.
		
		
		//MAX_VALUE does not allow any averageSales() to be greater than max
//		double max=Double.MAX_VALUE; ---> original code
		double max = Double.MIN_VALUE;
		for(SalesReport r : reports) {
			if(r instanceof DetailedSalesReport) {
				if(r.averageSales() > max) {
					max = r.averageSales();
				}
			}
		}
		return max;
	}
	
	public ArrayList<DetailedSalesReport> getDetailedReports() {
		// Returns an array of the DetailedSalesReports
		// Write code here
		ArrayList<DetailedSalesReport> detailedReports = new ArrayList<>();
		for(SalesReport r : reports) {
			if(r instanceof DetailedSalesReport) {
				detailedReports.add((DetailedSalesReport)r);
			}
		}
		return detailedReports;
	}
	
	public SalesReport getReport(int i) {
		if(i>=0 && i<reports.size()) {
			return reports.get(i);
		}
		return null;
	}
	
	public SalesReport removeReport(int i) {
		if(i>=0 && i<reports.size()) {
			return reports.remove(i);
		}
		return null;
	}

	@Override
	public String toString() {
		String msg = "";
		for(SalesReport sr : reports) {
			if(!(sr instanceof DetailedSalesReport)) {
				msg += "\nSalesReport ===>\n";
			} else {
				msg += "\nDetailedSalesReport ===>\n";
			}
			
			msg += String.format("%s\n%s\n", sr.getHeader(), sr.getBody());
		}
		return msg;
	}
}
