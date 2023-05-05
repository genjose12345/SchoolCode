package exercise_martian_equals;

public class MartianTest {

	public static void main(String[] args) {
		testEquals_SameWavelength_Only();
		testEquals_SameElevation_Only();
		testEquals_SameWavelengthAndElevation();
	}
	
	public static void testEquals_SameWavelength_Only() {
		System.out.println("-->testEquals_SameWavelength_Only()");
		//2 Martians have the same wavelength
		Martian r1 = new Martian(2,4);
		Martian r2 = new Martian(2,5);
		
		System.out.println("r1.equals(r2)=" + r1.equals(r2));
		System.out.println("r1 ==> " + r1);
		System.out.println("r2 ==> " + r2);
		
	}
	
	private static void testEquals_SameElevation_Only() {
		System.out.println("\n-->testEquals_SameElevation_Only()");
		//2 Martians have the same elevation
		Martian r1 = new Martian(2,4);
		Martian r2 = new Martian(1,4);
		
		System.out.println("r1.equals(r2)=" + r1.equals(r2));
		System.out.println("r1 ==> " + r1);
		System.out.println("r2 ==> " + r2);
	}
		
	private static void testEquals_SameWavelengthAndElevation() {
		System.out.println("\n-->testEquals_SameWavelengthAndElevation()");
		//2 Martians have the same wavelengths and elevations
		Martian r1 = new Martian(2,4);
		Martian r2 = new Martian(2,4);
		
		//2 completely different Objects in memory
		System.out.println("r1.equals(r2)=" + r1.equals(r2));
		System.out.println("r1 ==> " + r1);
		System.out.println("r2 ==> " + r2);
	}
}
