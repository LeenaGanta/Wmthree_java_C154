package com.sujata.persistence;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;
import com.sujata.database.CourseDataBase;
import com.sujata.database.EmployeeDataBase;
import com.sujata.exceptions.CourseNotFoundException;
import com.sujata.exceptions.CourseRegistrationsFullException;

public class CourseDaoImpl implements CourseDao {

	private CourseDataBase courseDataBase=new CourseDataBase();
	
	@Override
	public Course[] getAllCourses() {
		return courseDataBase.getCourses();
	}

	@Override
	public Course searchCourseById(String cId)throws CourseNotFoundException  {
		for(Course course:courseDataBase.getCourses()) {
			if(course.getCourseId().equals(cId))
				return course;
		}
		throw new CourseNotFoundException("Course with course id "+cId+" does not exist");
	}

	@Override
	public boolean addEmployeeForCourseId(String cID, Employee employee)throws CourseNotFoundException, CourseRegistrationsFullException  {
		int index=0;
		Course[] courses=courseDataBase.getCourses();
		for(Course course:courses) {
			if(course.getCourseId().equals(cID)) {
				Employee[] employees=courses[index].getEmployees();
				
				if(Course.getEmpCount()>=10) throw new CourseRegistrationsFullException("Course Registrations are full, Try next term");
				employees[Course.getEmpCount()]=employee;	
				courses[index].setEmployees(employees);
				
				int count=courses[index].getEmpCount();
				courses[index].setEmpCount(count+1);
				
				return true;
			}
			index++;
		}
		
		throw new CourseNotFoundException("Course with course id "+cID+" does not exist");
	}

	@Override
	public boolean deregisterEmployeeForCourse(String cId, int empID)throws CourseNotFoundException  {
		int index=0;
		Course[] courses=courseDataBase.getCourses();
		for(Course course:courses)
		{
			if(course.getCourseId().equals(cId))
			{
				Employee[] employees=courses[index].getEmployees();
				if(employees[index].getEmpId()==empID)
				{
					employees[index]=null;
					courses[index].setEmployees(employees);
					int count=courses[index].getEmpCount();
					courses[index].setEmpCount(count-1);
					return true;
				}
			}
		}
	
		throw new CourseNotFoundException("Course with course id "+cId+" does not exist");
	}

}
