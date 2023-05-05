package example_constructor_chaining.example1;

public class Test1 {

	public static void main(String[] args) {
		B b = new B(4);
	}

}

class A {
	public A() { 
		System.out.println("A"); 
   }
}

class B extends A {
	public B(int x) {
		//super();  // Same with or without this line
		System.out.println("B");   
	} 
}

