package org.emitter.types;

/**
 * @author jeremy
 *
 */
public class RegisterReq
{
	Since(1.0) Since(1.0) private String	appName;
	Since(1.0) Since(1.0) private String	device;
	Since(1.0) Since(1.0) private Source	source;
	Since(1.0) Since(1.0) private AuthReq	user;
	Since(1.0) Since(1.0) private AppConfig appConfig;
	
	/**
	 * 
	 */
	public RegisterReq()
	{

	}

	/**
	 * @return the appName
	 */
	public String getAppName()
	{
		return appName;
	}

	/**
	 * @return the device
	 */
	public String getDevice()
	{
		return device;
	}

	/**
	 * @return the source
	 */
	public Source getSource()
	{
		return source;
	}

	/**
	 * @return the user
	 */
	public AuthReq getUser()
	{
		return user;
	}

	/**
	 * @param appName
	 *            the appName to set
	 */
	public void setAppName(String appName)
	{
		this.appName = appName;
	}

	/**
	 * @param device
	 *            the device to set
	 */
	public void setDevice(String device)
	{
		this.device = device;
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
	 * @param user
	 *            the user to set
	 */
	public void setUser(AuthReq user)
	{
		this.user = user;
	}

	/**
	 * @return the appConfig
	 */
	public AppConfig getAppConfig()
	{
		return appConfig;
	}

	/**
	 * @param appConfig the appConfig to set
	 */
	public void setAppConfig(AppConfig appConfig)
	{
		this.appConfig = appConfig;
	}

}
