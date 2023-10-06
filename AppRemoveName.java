package practise;

import java.util.ArrayList;
import java.util.Iterator;

public class AppRemoveName {
    public static void main(String[] args) {
        // Create an ArrayList of student names
        ArrayList<String> studentNames = new ArrayList<String>();
        
        // Add some student names to the list
        studentNames.add("Anjali");
        studentNames.add("Sanchita");
        studentNames.add("Sakshi");
        studentNames.add("Samir");
        studentNames.add("Narendra");
        
        // Display the original list
        System.out.println("Original student list: " + studentNames);
        
        // Remove students whose names start with 'S'
        Iterator<String> iterator = studentNames.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("S")) {
                iterator.remove();
            }
        }
        
        // Display the updated list after removal
        System.out.println("Updated student list: " + studentNames);
    }
}
