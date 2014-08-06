package org.emitter.types;

import com.google.gson.annotations.Since;

/**
 * @author jeremy
 * 
 */
public class AuthResp
{
	@Since(1.0) private boolean	fail;
	@Since(1.0) private String	failReason;
	@Since(1.0) private String	token;

	public AuthResp()
	{

	}

	public String getFailReason()
	{
		return failReason;
	}

	/**
	 * @return the token
	 */
	public String getToken()
	{
		return token;
	}

	/**
	 * @return the userKey
	 */
	public boolean isFail()
	{
		return fail;
	}

	public void setFail(boolean fail)
	{
		this.fail = fail;
	}

	public void setFailReason(String failReason)
	{
		this.failReason = failReason;
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
