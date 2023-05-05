package example_list_of_lists_of_scores;

import java.util.ArrayList;
import java.util.Arrays;

public class Scores {
	public static void main(String[] arg) {
		testLists1();
		testLists2();
	}
	
	public static void testLists1() {
		System.out.println("\ntestLists1");
		ArrayList<Integer> sec1Scores = new ArrayList<>(Arrays.asList(78,89,82,94,73));
		ArrayList<Integer> sec2Scores = new ArrayList<>(Arrays.asList(98,94,86,91,93,85 ));
		ArrayList<Integer> sec3Scores = new ArrayList<>(Arrays.asList(63,78,74,68));
		
		ArrayList<ArrayList<Integer>> sections = new ArrayList<>();
		
		sections.add(sec1Scores);  sections.add(sec2Scores);  sections.add(sec3Scores);
		
		ArrayList<Integer> sec = sections.get(1);
		
		for(ArrayList<Integer> section : sections) {
			for(int score : section) {
				System.out.print(score + " ");
			}
			System.out.print("\n");
		}
		
		for(int i=0; i<sections.size(); i++) {
			ArrayList<Integer> section = sections.get(i);
			for(int j=0; j<section.size(); j++) {
				int score = section.get(j);
				System.out.print(score + " ");
			}
			System.out.print("\n");
		}


	}
	
	public static void testLists2() {
		System.out.println("\ntestLists2");
		
		String[] sec1Names = {"Dom", "Nia", "Cam"};
		String[] sec2Names = {"Art", "Ayia", "Del", "Lem"};
		
		ArrayList<String[]> sections = new ArrayList<>();
		
		sections.add(sec1Names);  sections.add(sec2Names);
		
		String[] sec = sections.get(1);
		
		for(String[] section : sections) {
			for(String name : section) {
				System.out.print(name + " ");
			}
			System.out.print("\n");
		}
		
		for(int i=0; i<sections.size(); i++) {
			String[] section = sections.get(i);
			for(int j=0; j<section.length; j++) {
				String name = section[j];
				System.out.print(name + " ");
			}
			System.out.print("\n");
		}


	}

}
