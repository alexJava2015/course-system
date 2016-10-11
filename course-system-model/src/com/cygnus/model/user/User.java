/**
 * 
 */
package com.cygnus.model.user;

import java.util.Set;

/**
 * @author jorge
 *
 */
public class User {

	private Long id;
	
	private String email;
	
	private String password;
	
	private Set<UserSocialContact> socialContacts;
	
}
