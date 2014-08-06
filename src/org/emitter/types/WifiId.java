package org.emitter.types;

public class WifiId
{
	@Since(1.0) private String	BSSID, SSID;

	/**
	 * 
	 */
	public WifiId()
	{

	}

	/**
	 * @param bSSID
	 * @param sSID
	 */
	public WifiId(String bSSID, String sSID)
	{
		super();
		BSSID = bSSID;
		SSID = sSID;
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
		WifiId other = (WifiId) obj;
		if (BSSID == null)
		{
			if (other.BSSID != null)
				return false;
		}
		else if (!BSSID.equals(other.BSSID))
			return false;
		if (SSID == null)
		{
			if (other.SSID != null)
				return false;
		}
		else if (!SSID.equals(other.SSID))
			return false;
		return true;
	}

	/**
	 * @return the bSSID
	 */
	public String getBSSID()
	{
		return BSSID;
	}

	/**
	 * @return the sSID
	 */
	public String getSSID()
	{
		return SSID;
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
		result = prime * result + ((BSSID == null) ? 0 : BSSID.hashCode());
		result = prime * result + ((SSID == null) ? 0 : SSID.hashCode());
		return result;
	}

	/**
	 * @param bSSID
	 *            the bSSID to set
	 */
	public void setBSSID(String bSSID)
	{
		BSSID = bSSID;
	}

	/**
	 * @param sSID
	 *            the sSID to set
	 */
	public void setSSID(String sSID)
	{
		SSID = sSID;
	}

}
