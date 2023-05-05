package exercise_stringerator;

import java.util.ArrayList;

public class Stringerator {
	private ArrayList<String> words = new ArrayList<>();
	
	public Stringerator(String[] newWords) {
		for(String word : newWords) {
			words.add(word);
		}
	}
	
	public int countWordsThatEqual(String word) {
		int count = 0;
		for(String w : words) {
			if(w.equals(word)) {
				count++;
			}
		}
		return count;
	}

	public ArrayList<String> getMirrorImage() {
		ArrayList<String> mirror = new ArrayList<>();
		for(String word : words) {
			mirror.add(word);
		}
		
		int oldEnd = words.size();
		for(int i=oldEnd-1; i>=0; i--) {
			mirror.add(words.get(i));
		}
		return mirror;
	}
	
	public void swap(int i, int j) {
		if(areIndicesValid(i,j)) {
			String wordAtI = words.get(i);
			words.set(i, words.get(j));
			words.set(j, wordAtI);
		}
	}
	
	private boolean areIndicesValid(int i, int j) {
		return i>=0 && i<words.size() &&
			   j>=0 && j<words.size();
	}

	public void moveFirstToEnd() {
		String word = words.get(0);
		words.remove(0);
		words.add(word);
	}

	public ArrayList<Integer> getLocationsOf(ArrayList<String> searchWords) {
		ArrayList<Integer> locs = new ArrayList<>();
		for(String word : searchWords) {
			int loc = words.indexOf(word);
			locs.add(loc);
		}
		return locs;
	}

//	public void double() {
//		ArrayList<Integer> locs = new ArrayList<>();
//		for(String word : searchWords) {
//			int loc = words.indexOf(word);
//			locs.add(loc);
//		}
//		return locs;
//	}

	@Override
	public String toString() {
		return words.toString();
	}

}
