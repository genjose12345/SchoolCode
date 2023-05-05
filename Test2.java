package example_constructor_chaining.example2b;

public class Test2 {
	public static void main(String[] args) {
		B b = new B(4);
	}
}

class A {
	public A() {}
	
	public A(int x) { 
		System.out.println("A"); 
	}
}

class B extends A {
	public B(int x) {
		System.out.println("B");   
	} 
}

