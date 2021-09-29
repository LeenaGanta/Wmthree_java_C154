package coursesForEmployees;

public class Employee {
	private int empID;
	private String empName;
	private String courseName;
	private CourseDetails course;
	
	public Employee(int empID, String empName, String courseName,CourseDetails course) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.courseName = courseName;
		this.course=course;
	}
	
	public CourseDetails getCourse() {
		return course;
	}

	public int getEmpID() {
		return empID;
	}
	public String getEmpName() {
		return empName;
	}
	public String getCourseName() {
		return courseName;
	}
	
	

}
