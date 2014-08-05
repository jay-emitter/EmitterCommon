/**
 * 
 */
package org.emitter.types;

/**
 * @author jeremy
 * 
 */
public class Source
{

	Since(1.0) Since(1.0) private String	deviceKey;
	Since(1.0) Since(1.0) private String	appKey;
	Since(1.0) Since(1.0) private String	userKey;

	/**
	 * 
	 */
	public Source()
	{
		super();
	}

	/**
	 * @param _userKey
	 * @param _appKey
	 * @param _deviceKey
	 */
	public Source(String _userKey, String _appKey, String _deviceKey)
	{
		super();
		userKey = _userKey;
		appKey = _appKey;
		deviceKey = _deviceKey;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Source other = (Source) obj;
		if (deviceKey == null)
		{
			if (other.deviceKey != null)
				return false;
		}
		else if (!deviceKey.equals(other.deviceKey))
			return false;
		if (appKey == null)
		{
			if (other.appKey != null)
				return false;
		}
		else if (!appKey.equals(other.appKey))
			return false;
		if (userKey == null)
		{
			if (other.userKey != null)
				return false;
		}
		else if (!userKey.equals(other.userKey))
			return false;
		return true;
	}

	/**
	 * @return the deviceKey
	 */
	public String getDeviceKey()
	{
		return deviceKey;
	}

	/**
	 * @return the appKey
	 */
	public String getAppKey()
	{
		return appKey;
	}

	/**
	 * @return the userKey
	 */
	public String getUserKey()
	{
		return userKey;
	}
	
	/**
	 * @param _deviceKey
	 *            the deviceKey to set
	 */
	public void setDeviceKey(String _deviceKey)
	{
		deviceKey = _deviceKey;
	}

	/**
	 * @param _appKey the appKey to set
	 *            
	 */
	public void setAppKey(String _appKey)
	{
		appKey = _appKey;
	}

	/**
	 * @param _userKey  the userKey to set
	 *          
	 */
	public void setUserKey(String _userKey)
	{
		userKey = _userKey;
	}


	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((deviceKey == null) ? 0 : deviceKey.hashCode());
		result = prime * result
				+ ((appKey == null) ? 0 : appKey.hashCode());
		result = prime * result + ((userKey == null) ? 0 : userKey.hashCode());
		return result;
	}

	
}
