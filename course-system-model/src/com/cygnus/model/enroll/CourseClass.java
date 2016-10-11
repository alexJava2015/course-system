/**
 * 
 */
package com.cygnus.model.enroll;

import java.util.Date;
import java.util.Set;

import com.cygnus.model.instructor.Instructor;
import com.cygnus.model.student.Student;

/**
 * @author jorge
 *
 */
public class CourseClass {

	private Long id;
	
	private Date startDate;
	
	private Date endDate;
	
	private Set<Instructor> instructors;
	
	private  String description;
	
	private Set<Student> attendants;
}
