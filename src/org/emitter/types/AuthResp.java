package org.emitter.types;

public class AuthResp
{
	private boolean	fail;
	private String	failReason;
	private String	token;

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
