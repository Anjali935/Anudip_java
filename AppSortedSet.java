package employeeSecond;

import java.util.SortedSet;
import java.util.TreeSet;

public class AppSortedSet {
  public static void main(String[] args) {
	SortedSet<Employee>employees=new TreeSet<>(new EmployeeSortByAge());
	employees.add( new Employee(1, "John Doe", 35, "HR", 50000.0));
	employees.add( new Employee(2, "Anjali", 43, "Developer", 50000.0));
	employees.add( new Employee(3, "muskan", 33, "Manager", 90000.0));
	employees.add( new Employee(4, "kajal", 45, "Assistant", 80000.0));
	employees.add( new Employee(5, "Nutan", 30, "Executive ", 40000.0));
	employees.add( new Employee(6, "Neonika", 20, "Accountant", 60000.0));
	for(Employee employee:employees)
	{
		System.out.println(employee);
	}
	SortedSet<Employee>employees1= new TreeSet<Employee>(new EmployeeSorted());
	employees1.addAll(employees);
	System.out.println();
	
	for(Employee employee:employees1)
	 {
		System.out.println(employee);
	}
}
}
