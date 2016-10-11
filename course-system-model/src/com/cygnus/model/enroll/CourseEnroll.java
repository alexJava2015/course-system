/**
 * 
 */
package com.cygnus.model.enroll;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.cygnus.model.course.Course;
import com.cygnus.model.course.CourseModality;
import com.cygnus.model.instructor.Instructor;
import com.cygnus.model.student.Student;

/**
 * @author jorge
 *
 */
public class CourseEnroll {

	private Long id;
	
	private Course course;
	
	private Date startDate;
	
	private Date endDate;
	
	private CourseModality modality;
	
	private List<CourseClass> classes;
	
	private CourseLocation  location;
	
	private Set<CoursePromotion> promotions;
	
	private Set<Student> enrolledStudents;
	
	private Float price;
	
	
}
