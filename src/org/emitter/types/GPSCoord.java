package org.emitter.types;

import com.google.gson.annotations.Since;

public class GPSCoord
{
	@Since(1.0) private double	longitude, latitude, altitude;

	public GPSCoord()
	{

	}

	/**
	 * @return the altitude
	 */
	public double getAltitude()
	{
		return altitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude()
	{
		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude()
	{
		return longitude;
	}

	/**
	 * @param altitude
	 *            the altitude to set
	 */
	public void setAltitude(double altitude)
	{
		this.altitude = altitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(double latitude)
	{
		this.latitude = latitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(double longitude)
	{
		this.longitude = longitude;
	}

}
