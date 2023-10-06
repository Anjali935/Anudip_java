package practiseArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppEmployee {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// user input
		ArrayList<Employee> employees = new ArrayList<>();

		while (true) {
			System.out.println("Enter employees Name:(or press 0 to exit)");
			String employeeName = sc.next();
			if (employeeName.equals("0")) {
				break;
			}
			System.out.println("Enter employees Gender: .");
			String employeeGender = sc.next();
			System.out.println("Enter employee Salary");
			Double employeeSalary = sc.nextDouble();
			Employee employee = new Employee(employeeName, employeeGender, employeeSalary);
			employees.add(employee);

		}
		// Calculate and display the average salary of all employees
		double averageSalaryAll = calculateAverageSalary(employees);
		System.out.println("Average Salary for All Employees: Rs" + averageSalaryAll);

		// Calculate and display the average salary based on male and female employees
		double averageSalaryMale = calculateAverageSalaryByGender(employees, "Male");
		System.out.println("Average Salary for Male Employees: Rs" + averageSalaryMale);

		double averageSalaryFemale = calculateAverageSalaryByGender(employees, "Female");
		System.out.println("Average Salary for Female Employees: Rs" + averageSalaryFemale);
	}

// Method to calculate the average salary of all employees
	public static double calculateAverageSalary(ArrayList<Employee> employees) {
		double totalSalary = 0;
		for (Employee emp : employees) {
			totalSalary += emp.getEmployeeSalary();
		}
		return totalSalary / employees.size();
	}

	// Method to calculate the average salary based on gender
	public static double calculateAverageSalaryByGender(ArrayList<Employee> employees, String gender) {
		double totalSalary = 0;
		int count = 0;
		for (Employee emp : employees) {
			if (emp.getEmployeeGender().equalsIgnoreCase(gender)) {
				totalSalary += emp.getEmployeeSalary();
				count++;
			}
		}
		return count > 0 ? totalSalary / count : 0;
	}
}
