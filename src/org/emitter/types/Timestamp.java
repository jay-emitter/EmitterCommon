package org.emitter.types;

import java.util.Date;

public class Timestamp {
	private long stamp;
	
	public Timestamp() 
	{
		stamp = System.currentTimeMillis() / 1000L;
	}
	/**
	 * @return the stamp
	 */
	public long getStamp() {
		return stamp;
	}
	/**
	 * @param stamp the stamp to set
	 */
	public void setStamp(long stamp) {
		this.stamp = stamp;
	}
	
	public Date getDate()
	{
		return new Date(stamp);
	}
	
	
}
