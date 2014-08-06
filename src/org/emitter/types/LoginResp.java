package org.emitter.types;

public class LoginResp
{
	@Since(1.0) private String	errorMsg;
	@Since(1.0) private Source	source;
	@Since(1.0) private String	token;

	public LoginResp()
	{
	}

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg()
	{
		return errorMsg;
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
	 * @param errorMsg
	 *            the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg)
	{
		this.errorMsg = errorMsg;
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
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token)
	{
		this.token = token;
	}

}
