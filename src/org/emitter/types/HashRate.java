package org.emitter.types;

import com.google.gson.annotations.Since;

/**
 * @author jeremy
 * 
 */
public class HashRate
{
	/**
	 * @author jeremy
	 * 
	 */
	public enum Unit
	{
		/**
		 * Giga-hashes/second
		 */
		GHS,

		/**
		 * Kilo-hashes/second
		 */
		KHS,

		/**
		 * Mega-hashes/second
		 */
		MHS
	}

	@Since(1.0) private boolean		accepted;
	@Since(1.0) private float		rate;
	@Since(1.0) private Timestamp	time;
	@Since(1.0) private Unit		unit;

	/**
	 * 
	 */
	public HashRate()
	{

	}

	/**
	 * @param rate
	 * @param unit
	 *            the Unit of measurement
	 * @param time
	 *            Time this rate was achieved
	 */
	public HashRate(float rate, Unit unit, Timestamp time)
	{
		super();
		this.rate = rate;
		this.unit = unit;
		this.time = time;
	}

	/**
	 * @return the rate
	 */
	public float getRate()
	{
		return rate;
	}

	/**
	 * @return the time
	 */
	public Timestamp getTime()
	{
		return time;
	}

	/**
	 * @return the unit
	 */
	public Unit getUnit()
	{
		return unit;
	}

	/**
	 * @return if the work was accepted by the network
	 */
	public boolean isAccepted()
	{
		return accepted;
	}

	/**
	 * @param accepted
	 */
	public void setAccepted(boolean accepted)
	{
		this.accepted = accepted;
	}

	/**
	 * @param rate
	 *            the rate to set
	 * 
	 */
	public void setRate(float rate)
	{
		this.rate = rate;
	}

	/**
	 * @param time
	 *            the time to set
	 * 
	 */
	public void setTime(Timestamp time)
	{
		this.time = time;
	}

	/**
	 * @param unit
	 *            the unit of measurement to set
	 * 
	 */
	public void setUnit(Unit unit)
	{
		this.unit = unit;
	}
}
