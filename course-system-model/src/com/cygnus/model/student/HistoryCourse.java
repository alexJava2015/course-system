/**
 * 
 */
package com.cygnus.model.student;

import java.util.Set;

import com.cygnus.model.course.Course;
import com.cygnus.model.enroll.CourseEnroll;

/**
 * @author jorge
 *
 */
public class HistoryCourse {

	private Long id;
	
	private CourseEnroll enroll;
	
	private Student student;
	
	private CourseProgress status;
	
	private Set<CourseAppraisal> appraisals;
	
}
