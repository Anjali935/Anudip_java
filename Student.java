package comparator;

public class Student {
	private String StudentName;
	private Integer StudentRollno;
	private String StudentBatch;
	private String StudentCourse;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, Integer studentRollno, String studentBatch, String studentCourse)
	{
		super();
		StudentName = studentName;
		StudentRollno = studentRollno;
		StudentBatch = studentBatch;
		StudentCourse = studentCourse;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public Integer getStudentRollno() {
		return StudentRollno;
	}

	public void setStudentRollno(Integer studentRollno) {
		StudentRollno = studentRollno;
	}

	public String getStudentBatch() {
		return StudentBatch;
	}

	public void setStudentBatch(String studentBatch) {
		StudentBatch = studentBatch;
	}

	public String getStudentCourse() {
		return StudentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		StudentCourse = studentCourse;
	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentRollno=" + StudentRollno + ", StudentBatch="
				+ StudentBatch + ", StudentCourse=" + StudentCourse + "]";
	}
	

}
