package comparator;

import java.util.Collections;
import java.util.List;


public class Main 
{  public void maint(String args[])
  { List<Student>students=new StudentImpl().getStudentList();
	for(Student student:students)
	{
		System.out.println(student.getStudentList());
	}
	Collections.sort(students,new SortbyName());
	System.out.println();
	
  }
   
}
