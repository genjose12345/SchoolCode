package exercise_wordlists;

import java.util.ArrayList;
import java.util.Collections;

public class WordLists {
	ArrayList<ArrayList<String>> lists = new ArrayList<>();
	
	public WordLists() {}
	
	public void addList(ArrayList<String> list) {
		lists.add(list);
	}
	
	public ArrayList<String> getList(int i) {
		if(i>0 && i<lists.size()) {
			return lists.get(i);
		}
		return null;
	}

	public int countOccurrences(String keyWord) {
		int count=0;
		for(ArrayList<String> list : lists) {
			for(String word : list) {
				if(word.equals(keyWord)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public ArrayList<String> getAllWordsSorted() {
		ArrayList<String> sorted = new ArrayList<>();
		for(ArrayList<String> list : lists) {
			for(String word : list) {
				sorted.add(word);
			}
		}
		Collections.sort(sorted);
		return sorted;
	}

	public int getTotalNumWords() {
		int count = 0;
		for(ArrayList<String> list : lists) {
			count += list.size();
		}
		return count;
	}
}

