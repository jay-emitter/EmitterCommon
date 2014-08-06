package org.emitter.types;

import com.google.gson.annotations.Since;

public class RegisterResp
{
	@Since(1.0) private String	failReson;
	@Since(1.0) private Source	source;
	boolean						Success;
	@Since(1.0) private String	token;

	public RegisterResp()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the failReson
	 */
	public String getFailReson()
	{
		return failReson;
	}

	/**
	 * @return the source
	 */
	public Source getSource()
	{
		return source;
	}

	/**
	 * @return the token
	 */
	public String getToken()
	{
		return token;
	}

	/**
	 * @return the success
	 */
	public boolean isSuccess()
	{
		return Success;
	}

	/**
	 * @param failReson
	 *            the failReson to set
	 */
	public void setFailReson(String failReson)
	{
		this.failReson = failReson;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(Source source)
	{
		this.source = source;
	}

	/**
	 * @param success
	 *            the success to set
	 */
	public void setSuccess(boolean success)
	{
		Success = success;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token)
	{
		this.token = token;
	}

}
