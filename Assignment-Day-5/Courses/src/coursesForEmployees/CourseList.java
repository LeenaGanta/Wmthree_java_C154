package coursesForEmployees;

public class CourseList 
{
	 CourseDetails c1=new CourseDetails();
	 CourseDetails c2=new CourseDetails();
	 CourseDetails c3=new CourseDetails();
	 CourseDetails c4=new CourseDetails();
	
	void setCourses()
	{
		
		c1.setCourseName("Spring Boot");
		c1.setCourseFee(5000);
		c1.setTimeOfClass(CourseType.partTime);
		c1.setClassType(onlineOffline.online);
		
		
		c2.setCourseName("Java");
		c2.setCourseFee(2000);
		c2.setTimeOfClass(CourseType.partTime);
		c2.setClassType(onlineOffline.online);
		
		
		c3.setCourseName("PGP DataScience");
		c3.setCourseFee(400000);
		c3.setTimeOfClass(CourseType.fullTime);
		c3.setClassType(onlineOffline.online);
		
		
		c4.setCourseName("MBA");
		c4.setCourseFee(500000);
		c4.setTimeOfClass(CourseType.fullTime);
		c4.setClassType(onlineOffline.offline);

	}
  CourseDetails[] course= {c1,c2,c3,c4};

	public CourseDetails[] getCourse() {
		return course;
	}
	
}
