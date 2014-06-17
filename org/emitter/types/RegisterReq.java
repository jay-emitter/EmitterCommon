package org.emitter.types;

public class RegisterReq {
	private Source source;
	private AuthReq user;
	private String device;
	private String appName;
	
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
	 * @return the user
	 */
	public AuthReq getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(AuthReq user) {
		this.user = user;
	}

	/**
	 * @return the device
	 */
	public String getDevice() {
		return device;
	}

	/**
	 * @param device the device to set
	 */
	public void setDevice(String device) {
		this.device = device;
	}

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public RegisterReq() {
		
	}

}
