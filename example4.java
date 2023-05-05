package example_constructor_chaining_example_1;


public class example4
{
	public static void main(String[] args)
	{
		B b = new B('T');
	}
}

class A
{
	public A() 
	{ 
		System.out.println("M"); 
	}
}

class B extends A
{
	public B()
	{
		System.out.println("Z");
	}
	public B( char c ) 
	{
		this();
		System.out.println(c);
	}
}