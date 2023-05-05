package exercise_cellular_account;

public class DeluxeCellularAccount extends CellularAccount {
	public double freeMinutes;
	
	public DeluxeCellularAccount(double minutesMax, double costPerMin, double freeMinutes) {
		super(minutesMax, costPerMin);
		this.freeMinutes = freeMinutes;
	}

	@Override
	public double getAmountDue() {
		double currentMinutes = minutesUsed; // 1200
		double cellCost = 0.0;
		if(currentMinutes > freeMinutes) {  // 1200 > 400
			if(currentMinutes > minutesMax) { // 1200 > 1000
				double regularMin = minutesMax - freeMinutes; // 1000-400=600 
				double extraMin = currentMinutes - minutesMax; // 1200-1000 = 200
				cellCost = costPerMin*regularMin + (1+0.2)*costPerMin*extraMin;
			}
			else {
				cellCost = costPerMin*(minutesUsed-freeMinutes);
			}
			
		}
		return cellCost;

	}
	public static void main(String[] args) {
		DeluxeCellularAccount acnt = new DeluxeCellularAccount(500.0, 0.05, 100);
		System.out.println(acnt); // expect $0
		acnt.makeCall(50.0);
		System.out.println(acnt); // expect $0
		acnt.makeCall(150.0);  
		System.out.println(acnt); // expect $5
		acnt.makeCall(400.0);
		System.out.println(acnt); // should be 20+6 = $26
	}
}
