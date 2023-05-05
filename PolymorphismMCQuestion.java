package example_polymorphic_assignment_questions;
public class PolymorphismMCQuestion
{
	public static void main(String[] args)
	{
		m( new A() );
		m( new B() );
		m( new C() );
		m2( new C() );
		// m2( new B() );
	}
	public static void m( A a ) { System.out.println( a.toString() ); }	
	public static void m2( C c ) { System.out.println( c.toString() ); }	
}

class A 
{
	public String toString() { return "A"; }

}

class B extends A 
{
	public String toString() { return "B"; }
}

class C extends B 
{ 
}

