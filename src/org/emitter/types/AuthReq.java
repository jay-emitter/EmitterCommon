package org.emitter.types;

public class AuthReq
{
	private String	username, password;

	public AuthReq()
	{

	}

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
