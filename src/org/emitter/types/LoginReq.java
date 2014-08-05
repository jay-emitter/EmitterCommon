package org.emitter.types;

public class LoginReq
{
	Since(1.0) Since(1.0) private AuthReq	auth;
	Since(1.0) Since(1.0) private String	deviceName;
	Since(1.0) Since(1.0) private Source	source;

	public LoginReq()
	{

	}

	/**
	 * @return the auth
	 */
	public AuthReq getAuth()
	{
		return auth;
	}

	/**
	 * @return the deviceName
	 */
	public String getDeviceName()
	{
		return deviceName;
	}

	/**
	 * @return the source
	 */
	public Source getSource()
	{
		return source;
	}

	/**
	 * @param auth
	 *            the auth to set
	 */
	public void setAuth(AuthReq auth)
	{
		this.auth = auth;
	}

	/**
	 * @param deviceName
	 *            the deviceName to set
	 */
	public void setDeviceName(String deviceName)
	{
		this.deviceName = deviceName;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(Source source)
	{
		this.source = source;
	}

}
