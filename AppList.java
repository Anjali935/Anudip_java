package employeeFirst;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AppList {
  public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	// user input
	List<Employee> employees=new LinkedList<>();
	char ch='y';
	do
	{
		System.out.println("Enter employees id.");
	    Integer employeeId=sc.nextInt();
		System.out.println("Enter employees name .");
		String employeeName=sc.next();
		System.out.println("Enter employee Departement");
		String employeeDepartement=sc.next();
		System.out.println("Enter employee Phone Number");
		BigInteger employeePhoneNumber=sc.nextBigInteger();
		System.out.println("Enter employee Salary");
		Double employeeSalary=sc.nextDouble();
		Employee employee =new Employee(employeeId,employeeName,employeeDepartement,employeePhoneNumber,employeeSalary);
		employees.add(employee);
		System.out.println("Would, you like to add more records(Press y or n)");
		ch=sc.next().charAt(0);
	}while(ch=='y');
	for(Employee employee:employees)
	{
		System.out.println(employee);
		System.out.println(employee.getEmployeeDepartement());
	}
}
}
