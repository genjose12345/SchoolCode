package example_equals_arraylist_dogs;

import java.util.ArrayList;
import java.util.Collections;

public class TestMethodsThatRelyOnEquals {
	public static void main(String[] args) {

		ArrayList<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog("Juno"));
		dogs.add(new Dog("Leo"));
		dogs.add(new Dog("Chaps"));
		dogs.add(new Dog("Ace"));
		dogs.add(new Dog("Chaps"));
		
		System.out.println(
		     dogs.contains(new Dog("Ace")));  // true
		System.out.println(
		     dogs.indexOf(new Dog("Chaps")));  // 2
		System.out.println(
			     dogs.indexOf(new Dog("Zoro")));  // -1
		System.out.println(
			     dogs.lastIndexOf(new Dog("Chaps")));  // 4
		System.out.println(
			     dogs.remove(new Dog("Chaps")));  // true
		System.out.println(
			     dogs.remove(new Dog("Zoro")));  // false
		
	}
}
