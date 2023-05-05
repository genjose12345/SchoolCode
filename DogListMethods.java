package exercise_lists_dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DogListMethods {
	public static void main(String[] args) {
		testShift1();
		testShift1_2();
		testShiftN();
		testCullDogs();
		testCullDogs2();
	}

	public static void testShift1() {
		System.out.println("\ntestShift1()");
		List<Dog> dogs = getDogs();
		System.out.println("Original: " + dogs);
		shift1(dogs);
		System.out.println(" Shifted: " + dogs);
	}

	public static void testShift1_2() {
		System.out.println("\ntestShift1_2()");
		List<Dog> dogs = getDogs();
		System.out.println("Original: " + dogs);
		shift1_2(dogs);
		System.out.println(" Shifted: " + dogs);
	}

	public static void testShiftN() {
		System.out.println("\ntestShiftN()");
		List<Dog> dogs = getDogs2();
		System.out.println("Original: " + dogs);
		shiftN(dogs,2);
		System.out.println(" Shifted: " + dogs);
	}

	public static void testCullDogs() {
		System.out.println("\ntestCullDogs()");
		List<Dog> dogs = getDogs3();
		List<Boolean> keepers = getKeepers3();
		System.out.println("   Original dogs: " + dogs);
		System.out.println("Original keepers: " + keepers);
		List<Dog> culledDogs = cullDogs(dogs, keepers);
		System.out.println("       Kept dogs: " + dogs);
		System.out.println("     Culled dogs: " + culledDogs);
	}

	public static void testCullDogs2() {
		System.out.println("\ntestCullDogs2()");
		List<Dog> dogs = getDogs3();
		List<Boolean> keepers = getKeepers3();
		System.out.println("   Original dogs: " + dogs);
		System.out.println("Original keepers: " + keepers);
		List<Dog> culledDogs = cullDogs2(dogs, keepers);
		System.out.println("       Kept dogs: " + dogs);
		System.out.println("     Culled dogs: " + culledDogs);
	}

	private static List<Dog> getDogs() {
		List<Dog> dogs = new ArrayList<>(Arrays.asList(
				new Dog("b",1), new Dog("c",1), new Dog("d",1), new Dog("e",1),
				new Dog("f",1), new Dog("g",1), new Dog("h",1), new Dog("a",1)));
		return dogs;
	}

	private static List<Dog> getDogs2() {
		List<Dog> dogs = new ArrayList<>(Arrays.asList(
				new Dog("c",1), new Dog("d",1), new Dog("e",1), new Dog("f",1),
				new Dog("g",1), new Dog("h",1), new Dog("a",1), new Dog("b",1)));
		return dogs;
	}

	private static List<Dog> getDogs3() {
		List<Dog> dogs = new ArrayList<>(Arrays.asList(
				new Dog("a",1), new Dog("b",1), new Dog("c",1), new Dog("d",1),
				new Dog("e",1), new Dog("f",1)));
		return dogs;
	}

	private static List<Boolean> getKeepers3() {
		List<Boolean> keepers = new ArrayList<>(Arrays.asList(
				false, true, true, false, false, true));
		return keepers;
	}

	public static List<Dog> getOldDogs(List<Dog> dogs, int age) {
		List<Dog> oldDogs = new ArrayList<>();
		for(Dog d : dogs) {
			if(d.getAge() > age) {
				oldDogs.add(d);
			}
		}
		return oldDogs;
	}
	
	public static List<Integer> getIndicesForOldDogs(List<Dog> dogs, int age) {
		List<Integer> indices = new ArrayList<>();
		for(int i=0; i<dogs.size(); i++) {
			if(dogs.get(i).getAge() > age) {
				indices.add(i);
			}
		}
		return indices;
	}

	public static void swapDogs(List<Dog> dogs1, List<Dog> dogs2) {
		if(dogs1.size() != dogs2.size()) {
			return;
		}
		for(int i=0; i<dogs1.size(); i++) {
			Dog d1 = dogs1.get(i);
			Dog d2 = dogs2.get(i);
			if(d2.getAge() > d1.getAge()) {
				dogs1.set(i, d2);
				dogs2.set(i, d1);
			}
		}
	}

	public static void shift1(List<Dog> dogs) {
		
		Dog lastDog = dogs.get(dogs.size()-1);
		Dog prevDog = dogs.get(0);
		for(int i=1; i<dogs.size(); i++) {
			Dog temp = dogs.get(i); // Remember before writing over
			dogs.set(i, prevDog);
			prevDog = temp;
		}
		dogs.set(0, lastDog);
	}

	// Easier approach
	public static void shift1_2(List<Dog> dogs) {
		Dog lastDog = dogs.get(dogs.size()-1);
		for(int i=dogs.size()-1; i>0; i--) {
			dogs.set(i, dogs.get(i-1));
		}
		dogs.set(0, lastDog);
	}

	public static void shiftN(List<Dog> dogs, int n) {
		for(int i=0; i<n; i++) {
			shift1_2(dogs);
		}
	}


	public static List<Dog> cullDogs(List<Dog> dogs, List<Boolean> keepers) {
		LinkedList<Dog> culledDogs = new LinkedList<>();
		return culledDogs;
	}

	public static List<Dog> cullDogs2(List<Dog> dogs, List<Boolean> keepers) {
		LinkedList<Dog> culledDogs = new LinkedList<>();
		Iterator<Dog> iterDog = dogs.iterator();
		Iterator<Boolean> iterKeepers = keepers.iterator();
		while(iterKeepers.hasNext()) {
			Dog d = iterDog.next();
			boolean shouldKeep = iterKeepers.next();
			if(!shouldKeep) {
				iterDog.remove();
				culledDogs.add(d);
			}
		}
		return culledDogs;
	}

}

