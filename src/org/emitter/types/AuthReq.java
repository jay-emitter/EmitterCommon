package org.emitter.types;

import com.google.gson.annotations.Since;

/**
 * @author jeremy
 * 
 */
public class AuthReq
{
	@Since(1.0) private String	username;
	@Since(1.0) private String password;

	/**
	 * 
	 */
	public AuthReq()
	{

	}

	/**
	 * @param user
	 * @param pass
	 */
	public AuthReq(String user, String pass)
	{
		username = user;
		password = pass;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @return the username
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

}
