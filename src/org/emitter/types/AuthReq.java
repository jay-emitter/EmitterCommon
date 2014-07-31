package org.emitter.types;

public class AuthReq 
{
	private String username, password;
	
	public AuthReq(String user, String pass) 
	{
		username = user;
		password = pass;
	}
	public AuthReq() 
	{
		
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
