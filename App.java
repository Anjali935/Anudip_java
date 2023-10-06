package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Map<Integer, String> records = new HashMap<>();
		records.put(101, "Anjali");
		records.put(102, "sakshi");
		records.put(103, "Kashish");
		// System.out.println(records);
		for (Map.Entry<Integer, String> entry : records.entrySet()) {
			System.out.println(entry);
			// System.out.println(entry.getValue());
			// System.out.println(entry.getKey());
		}
		// System.out.println(records.keySet); // It give all the keys
		// If we insert duplicate keys then last value is assigned to the key value
		// use null only one time as it update last value with the first value
		// map to set .It is more efficient to use keySet
		Set<Integer> keys = new HashSet<>(records.keySet());
		System.out.println(keys);
		// map to list
		List<String> values = new ArrayList<>(records.values());
		System.out.println(values);
		//TreeMap will sort bydefault in asscending order 
		//Hashtable
		Map<Integer,String> records1=new Hashtable<>();
		records1.put(106, "Manish");
		System.out.println(records1);
		
		
		
		
 	}
}
