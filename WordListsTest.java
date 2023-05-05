package exercise_wordlists;

import java.util.ArrayList;
import java.util.Arrays;

public class WordListsTest {

	public static void main(String[] args) {
		testAddSingleList();
		testAddMultipleLists();
		testGetList_ValidLoc();
		testGetList_InvalidLoc();
		testCountOccurrences();
		testGetAllWordsSorted();
		testGetTotalNumWords_SingleList();
		testGetTotalNumWords_MultipleLists();
	}
	
	private static void testAddSingleList() {
		System.out.println("-->testAddSingleList()");
		ArrayList<String> list = new ArrayList<>(Arrays.asList(
				"zen", "new", "kitten"));
		WordLists wLists = new WordLists();
		
		wLists.addList(list);
		System.out.println("Total Num Words should be 3. Total Num Words = " + wLists.getTotalNumWords());
	}
	
	private static void testAddMultipleLists() {
		System.out.println("\n-->testAddMultipleLists()");
		WordLists wLists = getWordLists();
		
		System.out.println("Total Num Words should be 9. Total Num Words = " + wLists.getTotalNumWords());
	}
	
	private static void testGetList_ValidLoc() {
		System.out.println("\n-->testGetList_ValidLoc()");
		WordLists wLists = getWordLists();
		
		int loc = 2;
		ArrayList<String> retrieved = wLists.getList(loc);
		System.out.println(retrieved);
	}
	
	private static void testGetList_InvalidLoc() {
		System.out.println("\n-->testGetList_InvalidLoc()");
		WordLists wLists = getWordLists();
		
		int loc = -5;
		ArrayList<String> retrieved = wLists.getList(loc);
		System.out.println(retrieved);
	}
	
	private static void testCountOccurrences() {
		System.out.println("\n-->testCountOccurrences()");
		WordLists wLists = getWordLists();
		
		int countOccurrences1 = wLists.countOccurrences("bent");
		int countOccurrences2 = wLists.countOccurrences("world");

		System.out.println("Expected Occurrences of \"bent\": 2");
		System.out.println("  Actual Occurrences of \"bent\": " + countOccurrences1);
		System.out.println("Expected Occurrences of \"world\": 0");
		System.out.println("  Actual Occurrences of \"world\": " + countOccurrences2);
	}
	
	private static void testGetAllWordsSorted() {
		System.out.println("\n-->testGetAllWordsSorted()");
		WordLists wLists1 = getWordLists();
		WordLists wLists2 = getWordLists_5Lists();
		ArrayList<String> sorted1 = wLists1.getAllWordsSorted();
		ArrayList<String> sorted2 =wLists2.getAllWordsSorted();
		System.out.println("Sorted words: wLists1 = " + sorted1);
		System.out.println("Sorted words: wLists2 = " + sorted2);	
	}
	
	private static void testGetTotalNumWords_SingleList() {
		System.out.println("\n-->testGetTotalNumWords_SingleList()");
		ArrayList<String> list = new ArrayList<>(Arrays.asList(
				"Pandas", "Numpy", "Seaborn", "Matplotlib", "Scikit-Learn", "Tkinter"));
		WordLists wLists = new WordLists();
		
		wLists.addList(list);
		int totalNumWords = wLists.getTotalNumWords();
		System.out.println("Total Num Words should be 6. Total num words: " + totalNumWords);
	}
	
	private static void testGetTotalNumWords_MultipleLists() {
		System.out.println("\n-->testGetTotalNumWords_MultipleLists()");
		WordLists wLists = getWordLists_5Lists();
		int totalNumWords = wLists.getTotalNumWords();
		System.out.println("Total Num Words should be 25. Total num words: " + totalNumWords);
	}
	
	
	/**
	 * Helper
	 */
	private static WordLists getWordLists() {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(
				"zen", "new", "kitten"));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(
				"potato", "art", "obsequious", "bent"));
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(
				"match", "bent"));
		WordLists wLists = new WordLists();
		wLists.addList(list1);
		wLists.addList(list2);
		wLists.addList(list3);
		return wLists;
	}
	
	private static WordLists getWordLists_5Lists() {
		ArrayList<String> list1 = new ArrayList<>(Arrays.asList(
				"Java", "Python", "JavaScript", "Ruby", "PHP"));
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList(
				"JavaFX", "Django", "React", "Ruby On Rails", "Laravel"));
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(
				"FXML", "HTML", "CSS", "Sass"));
		ArrayList<String> list4 = new ArrayList<>(Arrays.asList(
				"MySQL",  "Postgres", "MongoDB", "Cassandra", "Firebase"));
		ArrayList<String> list5 = new ArrayList<>(Arrays.asList(
				"Pandas", "Numpy", "Seaborn", "Matplotlib", "Scikit-Learn", "Tkinter"));
		
		WordLists wLists = new WordLists();
		wLists.addList(list1);
		wLists.addList(list2);
		wLists.addList(list3);
		wLists.addList(list4);
		wLists.addList(list5);
		return wLists;
	}
}
