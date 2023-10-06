package secondPractiseApp;

import java.util.Objects;

public class Employee {
	private Long employeeId;
	private String employeeName;
	private String employeeAddress;
	private Integer employeeAge;
	private String employeeGender;
	private Integer employeeSalary;
	public Employee(Long employeeId, String employeeName, String employeeAddress, Integer employeeAge,
			String employeeGender, Integer employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeAge = employeeAge;
		this.employeeGender = employeeGender;
		this.employeeSalary = employeeSalary;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public Integer getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public Integer getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return (employeeId.equals(other.getEmployeeId())&& employeeName.equalsIgnoreCase(null));
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeeAge=" + employeeAge + ", employeeGender=" + employeeGender
				+ ", employeeSalary=" + employeeSalary + "]";
	}

}
