package exercise_stringerator;

import java.util.ArrayList;
import java.util.Arrays;

public class StringeratorTest {
	public static void main(String[] args) {
		testCountWordsThatEqual();
		testMoveFirstToEnd();
		testSwap();
		testGetMirrorImage();
		testgetLocationsOf();		
	}
	
	public static void testCountWordsThatEqual() {
		System.out.println("\ntestCountWordsThatEqual()");
		
		// The words...
		String[] words = {"cat", "dog", "ant", "dog"};
		Stringerator s = new Stringerator(words);
		System.out.println("Original words: " + s);
		System.out.println("Number of occurences of 'cat'=" + s.countWordsThatEqual("cat"));
		System.out.println("Number of occurences of 'dog'=" + s.countWordsThatEqual("dog"));
		System.out.println("Number of occurences of 'zebra'=" + s.countWordsThatEqual("zebra"));
	}

	public static void testMoveFirstToEnd() {
		System.out.println("\ntestMoveFirstToEnd()");
		String[] words = {"E", "A", "B", "C", "D"};
		Stringerator s = new Stringerator(words);
		System.out.println("Before move: " + s);
		s.moveFirstToEnd();
		System.out.println("After move : " + s);
	}

	public static void testSwap() {
		System.out.println("\ntestSwap()");
		String[] words = {"A", "D", "C", "B", "E"};
		Stringerator s = new Stringerator(words);
		System.out.println("Before Swap: " + s);
		s.swap(1, 3);
		System.out.println("After .swap(1,3) : " + s);
	}

	public static void testGetMirrorImage() {
		System.out.println("\ntestGetMirrorImage()");
		
		String[] words = {"cat", "dog", "ant"};
		Stringerator s = new Stringerator(words);
		System.out.println("Original words: " + s);
		ArrayList<String> mirror = s.getMirrorImage();
		System.out.println("Mirror: " + mirror);
	}

	public static void testDouble() {
		System.out.println("\ntestDouble()");
		String[] words = {"cat", "dog", "ant"};
		Stringerator s = new Stringerator(words);
		System.out.println("Original word: " + s);
		ArrayList<String> mirror = s.getMirrorImage();
		System.out.println("Mirror: " + mirror);
	}



	public static void testgetLocationsOf() {
		System.out.println("\ngetLocationsOf()");
		String[] words = {"A", "B", "C", "D", "E"};
		Stringerator s = new Stringerator(words);
		System.out.println("Words: " + s);

		String[] temp = {"C", "Z", "E", "X", "A", "F"};
		ArrayList<String> searchWords = new ArrayList<>(Arrays.asList(temp));
		System.out.println("Words to search for: " + searchWords);
		ArrayList<Integer> locs = s.getLocationsOf(searchWords);
		System.out.println("Locations: " + locs);

	}

}
