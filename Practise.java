package practise;

import java.util.ArrayList;
import java.util.ListIterator;

public class Practise {
	public static void main(String[] args) {
		// Create an ArrayList
		ArrayList<String> colors = new ArrayList<String>();

		// Adding elements to the arraylist
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Pink");
		colors.add("Black");
		colors.add("Green");

		ListIterator<String> listIterator = colors.listIterator();

		// Print the original ArrayList created
		System.out.println("List Before remove() :- " + colors);

		// we want to remove Blue element from the arraylist
		for (String it : colors) {
			listIterator.next();
			// if we reached to required element break the
			// loop
			if (it == "Blue")
				break;
		}

		// remove color blue from arraylist
		listIterator.remove();

		System.out.println("List After remove():- " + colors);
	}
}
