package org.emitter.types;

public class RegisterResp {
	boolean Success;
	private String userKey;
	private String deviceKey;
	private String appKey;
	private String failReson;
	/**
	 * @return the success
	 */
	public boolean isSuccess() {
		return Success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(boolean success) {
		Success = success;
	}
	/**
	 * @return the userKey
	 */
	public String getUserKey() {
		return userKey;
	}
	/**
	 * @param userKey the userKey to set
	 */
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}
	/**
	 * @return the deviceKey
	 */
	public String getDeviceKey() {
		return deviceKey;
	}
	/**
	 * @param deviceKey the deviceKey to set
	 */
	public void setDeviceKey(String deviceKey) {
		this.deviceKey = deviceKey;
	}
	/**
	 * @return the appKey
	 */
	public String getAppKey() {
		return appKey;
	}
	/**
	 * @param appKey the appKey to set
	 */
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	/**
	 * @return the failReson
	 */
	public String getFailReson() {
		return failReson;
	}
	/**
	 * @param failReson the failReson to set
	 */
	public void setFailReson(String failReson) {
		this.failReson = failReson;
	}
	public RegisterResp() {
		// TODO Auto-generated constructor stub
	}

}
