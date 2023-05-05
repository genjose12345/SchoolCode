package exercise_corporation_salesreport_arraylist;

import java.util.ArrayList;

public class CorporationReportsTest {
	
	public static void main(String[] args) {
		
		testCreateCorporationAndAddReport();
		testCreateCorporationAndAddMultipleReports();
		testGetReportLargestAverageSalesDetailed();
		testGetReportLargestAverageSalesDetailed_NoDetailedSalesReports();
		testGetLargestAverageSalesDetailed();
		testGetLargestAverageSalesDetailed_NoDetailedSalesReports();
		testGetDetailedReports();
		testGetDetailedReports_NoDetailedReports();
		testGetReport_Loc_1();
		testGetReport_Loc_2();
		testGetReport_Loc_5();
		testGetReport_Loc_Minus2();
		testRemoveReport_ValidLoc();
		testRemoveReport_InvalidLoc();
	}
	
	private static void testCreateCorporationAndAddReport() {
		System.out.println("-->testCreateCorporationAndAddReport()");
		CorporationReports cr = new CorporationReports();
		SalesReport sr = new SalesReport("Wonka's Industries", generateData());
		
		cr.addReport(sr);
		System.out.println("Num reports should be 1. Num reports = " + cr.getNumReports());
	}
	
	private static void testCreateCorporationAndAddMultipleReports() {
		System.out.println("\n-->testCreateCorporationAndAddMultipleReports()");
		CorporationReports cr = new CorporationReports();
		SalesReport sr = new SalesReport("Wonka's Industries", generateData());
		DetailedSalesReport dsr = new DetailedSalesReport("Acme Inc.", generateData());
		
		cr.addReport(sr);
		cr.addReport(dsr);
		System.out.println("Num reports should be 2. Num reports = " + cr.getNumReports());		
	}
	
	private static void testGetReportLargestAverageSalesDetailed() {
		System.out.println("\n-->testGetReportLargestAverageSalesDetailed()");
		CorporationReports cr = generateCorporationReportsMix();
		
		//Getting the DetailedSalesReport with Largest Sales Average
		DetailedSalesReport dsr = cr.getReportLargestAverageSalesDetailed();
		System.out.println(dsr.getHeader() + "\n" + dsr.getBody());
	}
	
	private static void testGetReportLargestAverageSalesDetailed_NoDetailedSalesReports() {
		System.out.println("\n-->testGetReportLargestAverageSalesDetailed_NoDetailedSalesReports()");
		CorporationReports cr = generateCorporationReportsSalesReportsOnly();
		
		//Getting the DetailedSalesReport with Largest Sales Average
		DetailedSalesReport dsr = cr.getReportLargestAverageSalesDetailed();
		System.out.println("Expected: null");
		System.out.println("  Actual: "+ dsr);
	}
	
	private static void testGetLargestAverageSalesDetailed() {
		System.out.println("\n-->testGetLargestAverageSalesDetailed()");
		CorporationReports cr = generateCorporationReportsMix();
		
		//Getting the DetailedSalesReport with Largest Sales Average
		double maxAve = cr.getLargestAverageSalesDetailed();
		System.out.println(String.format("Max Average: $%,.2f", maxAve));
	}
	
	private static void testGetLargestAverageSalesDetailed_NoDetailedSalesReports() {
		System.out.println("\n-->testGetLargestAverageSalesDetailed_NoDetailedSalesReports()");
		CorporationReports cr = generateCorporationReportsSalesReportsOnly();
		
		//Getting the DetailedSalesReport with Largest Sales Average
		double maxAve = cr.getLargestAverageSalesDetailed();
		System.out.println(String.format("Max Average: $%,.2f", maxAve));
	}
	
	private static void testGetDetailedReports() {
		System.out.println("\n-->testGetDetailedReports()");
		CorporationReports cr = generateCorporationReportsMix();
		ArrayList<DetailedSalesReport> dsreports = cr.getDetailedReports();
		System.out.println("Reports ===>");
		for(DetailedSalesReport dsr : dsreports) {
			System.out.println(dsr.getHeader() + "\n" + dsr.getBody() + "\n" );
		}
	}
	
	private static void testGetDetailedReports_NoDetailedReports() {
		System.out.println("\n-->testGetDetailedReports_NoDetailedReports()");
		CorporationReports cr = generateCorporationReportsSalesReportsOnly();
		ArrayList<DetailedSalesReport> dsreports = cr.getDetailedReports();
		System.out.println("Reports ===>");
		System.out.println("Expected: null");
		if(dsreports.size() > 0) {
			for(DetailedSalesReport dsr : dsreports) {
				System.out.println(dsr.getHeader() + "\n" + dsr.getBody() + "\n" );
			}
		} else {
			System.out.println("  Actual: null");
		}
	}
	
	private static void testGetReport_Loc_1() {
		System.out.println("\n-->testGetReport_Loc_1()");
		CorporationReports cr = generateCorporationReportsMix();
		int loc = 1;
		
		//Getting Sales Report in index 1
		SalesReport sr = cr.getReport(loc);
		System.out.println(sr.getHeader() + "\n" + sr.getBody());
	}
	
	private static void testGetReport_Loc_2() {
		System.out.println("\n-->testGetReport_Loc_2()");
		CorporationReports cr = generateCorporationReportsMix();
		int loc = 2;
		
		//Getting Sales Report in index 3
		SalesReport sr = cr.getReport(loc);
		System.out.println(sr.getHeader() + "\n" + sr.getBody());
	}
	
	private static void testGetReport_Loc_5() {
		System.out.println("\n-->testGetReport_Loc_5()");
		CorporationReports cr = generateCorporationReportsMix();
		int loc = 5;
		
		//Getting Sales Report in index 5
		SalesReport sr = cr.getReport(loc);
		System.out.println("Expected: null");
		System.out.println("  Actual: " + sr);
	}
	
	private static void testGetReport_Loc_Minus2() {
		System.out.println("\n-->testGetReport_Loc_Minus2()");
		CorporationReports cr = generateCorporationReportsMix();
		int loc = -2;
		
		//Getting Sales Report in index -2
		SalesReport sr = cr.getReport(loc);
		System.out.println("Expected: null");
		System.out.println("  Actual: " + sr);
	}
	
	private static void testRemoveReport_ValidLoc() {
		System.out.println("\n-->testRemoveReport_ValidLoc()");
		CorporationReports cr = generateCorporationReportsMix();
		int loc = 1;
		
		System.out.println("Reports before removeReport(1)");
		System.out.println(cr);
		
		cr.removeReport(loc);
		System.out.println("Reports after removeReport(1)");
		System.out.println(cr);
	}
	
	private static void testRemoveReport_InvalidLoc() {
		System.out.println("\n-->testRemoveReport_InvalidLoc()");
		CorporationReports cr = generateCorporationReportsMix();
		int loc = 5;
		
		System.out.println("Reports before removeReport(5)");
		System.out.println(cr);
		
		cr.removeReport(loc);
		System.out.println("Reports after removeReport(5)");
		System.out.println(cr);
	}
	
	/**
	 * Helpers
	 */
	private static double[] generateData() {
		double[] data = new double[12];
		for(int i = 0; i < data.length; i++) {
			double sale = (Math.random() * 99999) + 10000;
			data[i] = sale;
		}
		return data;
	}
	
	private static SalesReport generateSalesReport(String company) {
		double[] data = generateData();
		SalesReport sr = new SalesReport(company, data);
		return sr;
	}
	
	private static SalesReport generateDetailedSalesReport(String company) {
		double[] data = generateData();
		SalesReport dsr = new DetailedSalesReport(company, data);
		return dsr;
	}
	
	private static CorporationReports generateCorporationReportsMix() {
		CorporationReports cr = new CorporationReports();
		SalesReport sr1 = generateSalesReport("Acme Corp");
		SalesReport sr2 = generateDetailedSalesReport("Wonka Inc");
		SalesReport sr3 = generateSalesReport("Pizza Planet");
		SalesReport sr4 = generateDetailedSalesReport("Moe's Bar");
		
		//Adding sr's to cr
		cr.addReport(sr1);
		cr.addReport(sr2);
		cr.addReport(sr3);
		cr.addReport(sr4);
		
		return cr;
	}
	
	private static CorporationReports generateCorporationReportsSalesReportsOnly() {
		CorporationReports cr = new CorporationReports();
		SalesReport sr1 = generateSalesReport("Acme Corp");
		SalesReport sr2 = generateSalesReport("Wonka Inc");
		SalesReport sr3 = generateSalesReport("Pizza Planet");
		SalesReport sr4 = generateSalesReport("Moe's Bar");
		
		//Adding sr's to cr
		cr.addReport(sr1);
		cr.addReport(sr2);
		cr.addReport(sr3);
		cr.addReport(sr4);
		
		return cr;
	}
	
}
