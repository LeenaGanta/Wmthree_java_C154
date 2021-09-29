package com.sujata.persistence;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;
import com.sujata.exceptions.CourseNotFoundException;
import com.sujata.exceptions.CourseRegistrationsFullException;

public interface CourseDao {
	
	Course[] getAllCourses();
	Course searchCourseById(String cId)throws CourseNotFoundException;
	boolean addEmployeeForCourseId(String cID,Employee employee)throws CourseNotFoundException, CourseRegistrationsFullException ;
	boolean deregisterEmployeeForCourse(String cId,int empId)throws CourseNotFoundException ;

}
