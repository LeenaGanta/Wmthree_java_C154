package com.sujata.service;

import com.sujata.beans.Course;
import com.sujata.beans.Employee;
import com.sujata.exceptions.CourseNotFoundException;
import com.sujata.exceptions.CourseRegistrationsFullException;

public interface CourseService {

	Course[] getAllCoursesForEmployee();
	boolean registerEmployeeForCourse(String cId,Employee employee)throws CourseNotFoundException, CourseRegistrationsFullException;
	boolean deregisterEmployeeForCourse(String cId,int empId)throws CourseNotFoundException;
	Employee[] listOfEmployeesForCourse(String cID)throws CourseNotFoundException;
}
