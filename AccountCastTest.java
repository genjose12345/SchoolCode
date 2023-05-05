package example_basic_gold_casting;

public class AccountCastTest {

	public static void main(String[] args) {
		testCasting1();
		test1();
		test2();
	}
	
	private static void testCasting1() {
		
//		Person p = new Person("Lenze");
//		BasicAccount ba = new BasicAccount(1900.0);
		BasicAccount a = new GoldAccount(90.0, 0.1);
		
//		GoldAccount ga = (GoldAccount)a;
				
		BasicAccount ba = new BasicAccount(90.0);
		
//		GoldAccount ga = (GoldAccount)ba;
	
	}
	
	private static void test1() {
		
		BasicAccount pa = new PlatinumAccount(600.0, 0.1);
		System.out.println(pa instanceof GoldAccount);   // true
		System.out.println(pa instanceof BasicAccount);  // true
		System.out.println(pa instanceof StudentAccount);  // false
		
	}

	private static void test2() {
		
		BasicAccount ga = new GoldAccount(200.0, 0.15);
		
		System.out.println(ga instanceof BasicAccount);  // true
		System.out.println(ga instanceof PlatinumAccount);  // false
		System.out.println(ga instanceof StudentAccount);  // false
	}

}
