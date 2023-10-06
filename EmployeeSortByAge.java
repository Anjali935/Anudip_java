package employeeSecond;

import java.util.Comparator;

public class EmployeeSortByAge implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (o1.getEmployeeAge()-o2.getEmployeeAge());
	}

}
