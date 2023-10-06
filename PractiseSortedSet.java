package practise;

import java.util.SortedSet;
import java.util.TreeSet;

public class PractiseSortedSet {
  public static void main(String[] args) {
	SortedSet<String> fruits =new TreeSet<>();
	fruits.add("Apple");
	fruits.add("Mango");
	fruits.add("Banana");
	fruits.add("Fig");
	fruits.add("Cherry");
	fruits.add("Date");
	// It give the sorted set upto f letter as the value given is fig.
	System.out.println(fruits.headSet("Fig"));
	
}
}
