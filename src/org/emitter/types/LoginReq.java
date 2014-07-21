package org.emitter.types;

public class LoginReq 
{
	private AuthReq auth;
	private Source source;
	private String deviceName;
	
	public LoginReq() 
	{
		
	}
	/**
	 * @return the auth
	 */
	public AuthReq getAuth() {
		return auth;
	}
	/**
	 * @param auth the auth to set
	 */
	public void setAuth(AuthReq auth) {
		this.auth = auth;
	}
	/**
	 * @return the source
	 */
	public Source getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(Source source) {
		this.source = source;
	}
	
	/**
	 * @return the deviceName
	 */
	public String getDeviceName() {
		return deviceName;
	}
	/**
	 * @param deviceName the deviceName to set
	 */
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	
	
}
