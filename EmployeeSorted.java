package employeeSecond;

import java.util.Comparator;

public class EmployeeSorted implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {
		
		return (emp2.getEmployeeName()).compareTo(emp1.getEmployeeName());
	}
   
}
