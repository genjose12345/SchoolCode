package example_basic_account_equals;

public class EqualsTest {

	public static void main(String[] args) {
		test1();
	}
	
	private static void test1() {
		BasicAccount ba1 = new BasicAccount(100.0);
		BasicAccount ba2 = new BasicAccount(100.0);
		BasicAccount ba3 = ba1;
		
		System.out.println(ba1.equals(ba3)); // true
		System.out.println(ba1.equals(ba2)); // false
		
		System.out.println(ba1==ba3); // true
		System.out.println(ba1==ba2); // false
	}
}
