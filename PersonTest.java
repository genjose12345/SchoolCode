package example_equals_person;

public class PersonTest {
	public static void main( String[] args ) {
		testEquals();
	}
	
	public static void testEquals() {
		Person p1 = new Person("Shay", 123);
		Person p2 = new Person("Shay", 456);
		Person p3 = new Person("Julie", 123);
		Employee e1 = new Employee("Jeri", 123);
		Employee e2 = new Employee("Jeri", 789);
		Employee e3 = new Employee("Suze", 789);
		
		System.out.println(p1.equals(p2));  // false
		System.out.println(p1.equals(p3));  // true
		
		System.out.println(p1.equals(e1));  // true
		System.out.println(e1.equals(e2));  // false
		System.out.println(e2.equals(e3));  // true
	}
}
