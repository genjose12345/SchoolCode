package example_polymorphic_assignment_questions;

public class AB2
{
	public static void main( String[] args )
	{
		W w = new W();
		X x = new X();
		Y y = new Y();
		Z z = new Z();
		
		w=x; w=y; w=z;
		x=z;
	}
}

class W
{
}

class X extends W
{
}

class Y extends W
{
}

class Z extends X
{
}