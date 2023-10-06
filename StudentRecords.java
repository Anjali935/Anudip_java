package comparator;

import java.util.ArrayList;
import java.util.List;

public class StudentRecords
{
	private static StudentRecords studentRecords;
	private List<Student> student;
	private StudentRecords()
	{
		student=new ArrayList<>();
		student.add(new Student( "John", 18, "AFO123", "C++"));
        student.add(new Student( "Alice",  17,  "AFO345", "Python"));
        student.add(new Student( "Bob",  19,  "AFO349", "Java"));
        
	}
}
