/**
 * 
 */
package com.cygnus.model.course;

import java.io.Serializable;
import java.net.URL;
import java.util.Set;

/**
 * @author jorge
 *
 */
public class Course implements Serializable {

	private static final long serialVersionUID = -2445720640726660437L;

	private Long id;
	
	private String name;
	
	private String description;
	
	private CourseStatus status;
	
	private Set<CourseModality> modalities;
	
	private byte[] logo;
	
	private URL landingPage;
	
	private CourseTopicTree topicTree;
	
	private Set<CourseResource> resources;
}
