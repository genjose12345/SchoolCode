package exercise_cellular_account;

public class CellularAccount {
	protected final double minutesMax;
	protected double costPerMin;
	protected double minutesUsed;  

	public CellularAccount(double minutesMax, double costPerMin) {
		this.minutesMax = minutesMax;
		this.costPerMin = costPerMin;
		this.minutesUsed = 0.0;
	}
	
	public double getCostPerMin() {
		return costPerMin;
	}
	public double getMinutesMax() {
		return minutesMax;
	}
	public double getMinutesUsed() {
		return minutesUsed;
	}

	public void makeCall(double length) {
		minutesUsed += length;
	}

	public double getAmountDue() {
		double cellCost = 0.0;
		if(minutesUsed > minutesMax) {
			double extraMin = minutesUsed - minutesMax;
			cellCost = costPerMin*minutesMax + (1+0.4)*costPerMin*extraMin;
		}
		else {
			cellCost = costPerMin*minutesUsed;
		}
		return cellCost;

	}

	@Override
	public String toString() {
		String msg = String.format("Amount Due=$%.2f, Used=%.1f min., Max=%.1f min., Cost Per Min=%.2f", 
				getAmountDue(), minutesUsed, minutesMax, costPerMin);
		return msg;
	}
	
	public static void main(String[] args) {
		CellularAccount acnt = new CellularAccount(500.0, 0.05);
		System.out.println(acnt);
		acnt.makeCall(100.0);
		System.out.println(acnt);
		acnt.makeCall(400.0);
		System.out.println(acnt);
		acnt.makeCall(100.0);
		System.out.println(acnt); // should be 25+7 = 32
	}
}
