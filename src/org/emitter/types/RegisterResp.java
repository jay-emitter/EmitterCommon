package org.emitter.types;

public class RegisterResp {
	boolean Success;
	private Source source;
	private String failReson;
	private String token;
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

}
