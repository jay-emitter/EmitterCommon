/**
 * 
 */
package org.emitter.types;

import com.google.gson.annotations.Since;

/**
 * @author jeremy
 *
 */
public class UserConfig
{
	@Since(1.0) private String email;
	
	@Since(1.0) private String address1;
	@Since(1.0) private String addressAppt;
	
	@Since(1.0) private String zipPostal;
	
	/**
	 * 
	 */
	public UserConfig()
	{
		// TODO Auto-generated constructor stub
	}

}
