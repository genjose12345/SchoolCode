package example_dog_wolfdog_constructor_chaining;

/**
 * This works, but is less clear than the verion in DogExample.java.
 * Why less clear? constructors should initialize variables
 * @author dgibson
 *
 */
public class DogExample_Inferior_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Dog2 {
	private String name = "undefined";
	
	public Dog2() {
	}

	public Dog2(String name) {
		this.name = name;
	}
}

class WolfDog2 extends Dog2 {
	private double toughness = 1.0;

	public WolfDog2() {
	}

	public WolfDog2(String name) {
		super(name);
	}

	public WolfDog2(String name, double toughness) {
		super(name);
		this.toughness = toughness;
	}
}
