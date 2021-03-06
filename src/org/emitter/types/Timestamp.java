package org.emitter.types;

import java.util.Date;

import com.google.gson.annotations.Since;

public class Timestamp
{
	@Since(1.0) private long	stamp;

	public Timestamp()
	{
		stamp = System.currentTimeMillis() / 1000L;
	}

	public Date getDate()
	{
		return new Date(stamp);
	}

	/**
	 * @return the stamp
	 */
	public long getStamp()
	{
		return stamp;
	}

	/**
	 * @param stamp
	 *            the stamp to set
	 */
	public void setStamp(long stamp)
	{
		this.stamp = stamp;
	}

}
