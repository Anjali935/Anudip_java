package comparator;

import java.util.Comparator;

public class SortByName implements Comparator<Student>
{
     public int compare(Student a,Student b)
     {   // sort alphabetically
    	 return a.getStudentName().compareTo(b.getStudentName());
     }
}
