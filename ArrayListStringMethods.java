package exercise_arraylist_string;

import java.util.ArrayList;

public class ArrayListStringMethods {
	public static void main(String[] args) {
		testBasicMethods();
	}

	public static void testBasicMethods() {
		
		ArrayList<String> vals = new ArrayList<>();
		vals.add("abc"); vals.add("def"); vals.add("ghi"); vals.add("jkl"); vals.add("mno");
		
		String m = "zzz";
		int size = vals.size();
		System.out.println(vals);

		vals.add(m);
		System.out.println(vals);

		vals.add(3, m);
		System.out.println(vals);

		String s = vals.get(2);
		s = vals.get(vals.size()-1);
		s = vals.get(0);

		s = vals.set(2, m);
		System.out.println(vals);

		s = vals.remove(4);
		System.out.println(vals);

		s = vals.remove(vals.size()-1);
		System.out.println(vals);

		s = vals.remove(0);
		System.out.println(vals);

		boolean isRemoved = vals.remove(m);
		System.out.println(vals);

		boolean isInVals = vals.contains(m);
		int  loc = vals.indexOf(m);
		
		for(String s1 : vals) {
			System.out.print(s1 + "-");
		}
		System.out.println();
		
		for(int i=0; i<vals.size(); i+=2) {
			System.out.print(vals.get(i) + "-");
		}
		System.out.println();
		
		vals.clear();
		
	}
}

