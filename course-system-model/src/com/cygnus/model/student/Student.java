/**
 * 
 */
package com.cygnus.model.student;

import java.util.Date;
import java.util.Set;

import com.cygnus.model.course.CareerPath;
import com.cygnus.model.user.User;

/**
 * @author jorge
 *
 */
public class Student extends User {

	private String name;
	
	private String lastName;
	
	private Date birthDate;
	
	private Set<CareerPath>  paths;
}
