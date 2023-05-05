package exercise_lists_integers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerListMethods {
	public static void main(String[] args) {
		testCombineInts();
	}

	public static void testCombineInts() {
		List<Integer> ints = getInts();
		System.out.println("Original: " + ints);
		List<Integer> newInts = combineInts(ints);
		System.out.println("Combined: " + newInts);
	}

	private static List<Integer> combineInts(List<Integer> ints) {
		List<Integer> newInts = new ArrayList<>();
		for(int i=0; i<ints.size(); i+=2) {
			newInts.add(ints.get(i) + ints.get(i+1));
		}
		return newInts;		
	}

	private static List<Integer> getInts() {
		List<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		return ints;		
	}

}

