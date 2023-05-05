package example_arraylist_integer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Illustrates the ArrayList<Integer> examples in the notes
 * 
 */
public class ArrayListIntegerExamples {

	public static void main(String[] args) {

		// for notes
//		Double val = 5.5;  // autoboxing
//		double y = val;  // unboxing
		
		ArrayList<Integer> ints = new ArrayList<>();

		ints.add(47);
		ints.add(91);
		ints.add(16);

		int size = ints.size();

		int x = ints.get(1);
		System.out.println( x );  // 91

		for(int i : ints) {
			System.out.print(i + ", ");
		}

		for(int i=0; i<ints.size(); i++) {
			System.out.print(ints.get(i) + ", ");
		}
		System.out.println();

		ints.add(1,33);  
		
		System.out.println(ints.contains(91));  // true
		System.out.println(ints.contains(4));  // false
		

		System.out.println(ints.indexOf(91));  // 2
		System.out.println(ints.indexOf(5));   // -1


		int y = ints.remove(1);
		System.out.println(y);  // 33

		boolean isRemoved = ints.remove((Integer)91);
		System.out.println(isRemoved);  // true

		ints.add(47);  
		
		int z = ints.set(2,5);  
		
		System.out.println(z);  // 47
		System.out.println(ints);
		
		ArrayList<Integer> ints2 = new ArrayList<>();
		ints2.add(51); ints2.add(9); ints2.add(7);
		
		ints.addAll(ints2);
		
		System.out.println("after addAll");
		System.out.println(ints);

		ArrayList<Integer> ints3 = new ArrayList<>(ints);
		
		System.out.println(ints.isEmpty()); // false

		System.out.println(ints.size()); // 6
		ints.clear();
		System.out.println(ints.isEmpty()); // true
		System.out.println(ints.size()); // 0

		/*
		 * Sorting...
		 */
		ints.clear();
		ints.add(47); ints.add(16); ints.add(5); ints.add(51); ints.add(9); ints.add(7);
		
		System.out.println("Collections.sort()");
		System.out.println(ints);
		Collections.sort(ints);
		System.out.println(ints);
		
		// Clear list and add some random values
		ints.clear();
		ints.add(47); ints.add(16); ints.add(5); ints.add(51); ints.add(9); ints.add(7);
		
		// Create new list from original
		ArrayList<Integer> sortedInts = new ArrayList<>(ints);
		System.out.println("Collections.sort(), preserve original");
		System.out.println("originals: " + ints);
		// Sort the new list
		Collections.sort(sortedInts);
		System.out.println("sorted: " + sortedInts);

		/*
		 * Sorting, ArrayList.sort()
		 */

		ints.clear();
		ints.add(47); ints.add(16); ints.add(5); ints.add(51); ints.add(9); ints.add(7);
		System.out.println("\nArrayList.sort()");
		System.out.println("originals: " + ints);
		ints.sort(null);
		System.out.println("sorted: " + ints);

		/*
		 * Sorting, ArrayList.sort(comp)
		 */

		ints.clear();
		ints.add(47); ints.add(16); ints.add(5); ints.add(51); ints.add(9); ints.add(7);
		System.out.println("\nArrayList.sort(comp)");
		System.out.println("originals: " + ints);
		ints.sort((a1, a2) -> a1.compareTo(a2));
		System.out.println("sorted: " + ints);

		
		/*
		 * Arrays.asList
		 */
		System.out.println("\nArrays.asList()");
		Integer[] temp = {2,5,7,3,9,6};
		ArrayList<Integer> vals = new ArrayList<>(Arrays.asList(temp));

		ArrayList<Integer> vals2 = new ArrayList<>(Arrays.asList(2,5,7,3,9,6));

		System.out.println(ints);
		
	}

}
