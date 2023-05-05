package exercise_department_equals;

public class DepartmentTest {

	public static void main(String[] args) {
		testEquals_SameCode_Only();
		testEquals_SameNumber_Only();
		testEquals_SameCodeAndNumber();
	}
	
	private static void testEquals_SameCode_Only() {
		System.out.println("-->testEquals_SameCode_Only()");
		Department d1 = new Department("Engineering", "023");
		Department d2 = new Department("Engineering", "123");
		
		System.out.println("d1.equals(d2)=" + d1.equals(d2));
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
	}
	
	private static void testEquals_SameNumber_Only() {
		System.out.println("\n-->testEquals_SameNumber_Only()");
		Department d1 = new Department("Engineering", "023");
		Department d2 = new Department("Mathematics", "023");
		
		System.out.println("d1.equals(d2)=" + d1.equals(d2));
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
	}
	
	private static void testEquals_SameCodeAndNumber() {
		System.out.println("\n-->testEquals_SameCodeAndNumber()");
		Department d1 = new Department("Engineering", "023");
		Department d2 = new Department("Engineering", "023");
		
		System.out.println("d1.equals(d2)=" + d1.equals(d2));
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
	}
}
