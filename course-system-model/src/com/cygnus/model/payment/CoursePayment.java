/**
 * 
 */
package com.cygnus.model.payment;

import java.util.Set;

import com.cygnus.model.enroll.CourseEnroll;
import com.cygnus.model.student.Student;

/**
 * @author jorge
 *
 */
public class CoursePayment {
	
	private Long id;
	
	private Student student;
	
	private CourseEnroll enroll;
	
	private PaymentStatus status;
	
	private PaymentType paymentType;
	
	private Set<PaymentDetail> detail;

}
