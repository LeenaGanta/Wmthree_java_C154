package coursesForEmployees;

public class CourseDetails 
{
	private String courseName;
	private int courseFee;
	CourseType TimeOfClass;
	onlineOffline classType;
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setCourseFee(int courseFee) {
		this.courseFee = courseFee;
	}
	public void setTimeOfClass(CourseType fulltime) {
		TimeOfClass = fulltime;
	}
	public void setClassType(onlineOffline classType) {
		this.classType = classType;
	}
	public String getCourseName() {
		return courseName;
	}
	public int getCourseFee() {
		return courseFee;
	}
	public CourseType getTimeOfClass() {
		return TimeOfClass;
	}
	public onlineOffline getClassType() {
		return classType;
	}
	@Override
	public String toString() {
		return "courseName=" + courseName + ", courseFee=" + courseFee + ", TimeOfClass=" + TimeOfClass
				+ ", classType=" + classType ;
	}
	
	
	
	
	
	
	
	

}
