package org.emitter.types;

public class AuthResp {
	private String token;
	private boolean fail;
	private String failReason;
	public AuthResp() {
		
	}
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
	/**
	 * @return the userKey
	 */
	
}
