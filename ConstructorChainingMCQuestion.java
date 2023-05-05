package example_constructor_chaining_example_2;
public class ConstructorChainingMCQuestion {
	public static void main(String[] args) {
		B b1 = new B(); System.out.println();
		
		B b2 = new B(9); System.out.println();
		B b3 = new B("s"); System.out.println();

		A a1 = new B(); System.out.println();
		A a2 = new B(9); System.out.println();
		A a3 = new B("s"); System.out.println();
	}
}

class A {
   public A() {
      System.out.println("1"); 
   }
   public A(int x) { 
      this();
      System.out.println("2"); 
   }
}

class B extends A {
   public B() {
      this(77);
      System.out.println("4");
   }
   public B(int x) { 
	   super(x);
      System.out.println("3");
   }
   public B(String s) {
	   System.out.println("2");
	}
}