package org.emitter.types;

public class HashRate
{
	public enum Unit
	{
		MHS,
		KHS,
		GHS
	}
	
	private float rate;
	private Unit unit;
	private Timestamp time;
	public HashRate()
	{
		
	}
	
	/**
	 * @param rate
	 * @param timestamp
	 * @param unit
	 * @param deviceName
	 */
	public HashRate(float rate,  Unit unit, Timestamp time) {
		super();
		this.rate = rate;
		this.unit = unit;
		this.time = time;
	}
	/**
	 * @return the rate
	 */
	public float getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	/**
	 * @return the unit
	 */
	public Unit getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	

	/**
	 * @return the time
	 */
	public Timestamp getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Timestamp time) {
		this.time = time;
	}
}