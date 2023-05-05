package exercise_corporation_salesreport_arraylist;

public class SalesReportTest {

	public static void main(String[] args) {
		/**
		 * As these two test methods are calling getReport(),
		 * and getReport() is itself calling getHeader() and getBody(),
		 * and getBody() is in turn calling averageSales(), there is no need
		 * to write more test code, since everything is being tested already.
		 */
		testGetReport();
		testGetMultipleReports();
	}
	
	private static void testGetReport() {
		System.out.println("-->testGetReport()");
		double[] salesData = {33423.32434, 93223.92, 78293.2342, 23449.9032,
				33923.92038, 49882.23432, 55239.9032, 90202.2393,
				77234.9923, 63292.23423, 82332.23423, 46232.32432};
		
		SalesReport sReport = new SalesReport("Acme Corp", salesData);
		String report = sReport.getReport();
		System.out.println(report);
	}
	
	private static void testGetMultipleReports() {
		System.out.println("\n-->testGetMultipleReports()");
		double[] salesData1 = generateData(); 
		double[] salesData2 = generateData();
		double[] salesData3 = generateData();
		SalesReport report1 = new SalesReport("Umbrella Corp", salesData1);
		SalesReport report2 = new SalesReport("Monsters Inc", salesData2);
		SalesReport report3 = new SalesReport("Pizza Planet", salesData3);
		SalesReport[] reports = {report1, report2, report3};
		writeReports(reports);
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
	
	
	public static void writeReports(SalesReport[] rpts) {
		for(SalesReport rpt : rpts)
			System.out.println(rpt.getReport() + "\n");
	}

}
