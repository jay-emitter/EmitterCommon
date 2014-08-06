package org.emitter.types;

import com.google.gson.annotations.Since;

public class WifiSignal implements Comparable<WifiSignal>
{
	@Since(1.0) private int		freqMhz;
	@Since(1.0) private WifiId	id;
	@Since(1.0) private int		leveldBm;

	/**
	 * 
	 */
	public WifiSignal()
	{

	}

	/**
	 * @param bSSID
	 * @param sSID
	 * @param leveldBm
	 * @param freqMhz
	 */
	public WifiSignal(String bSSID, String sSID, int leveldBm, int freqMhz)
	{
		super();
		this.id = new WifiId(bSSID, sSID);
		this.leveldBm = leveldBm;
		this.freqMhz = freqMhz;
	}

	@Override
	public int compareTo(WifiSignal arg0)
	{
		return arg0.leveldBm - leveldBm;
	}

	/**
	 * @return the freqMhz
	 */
	public int getFreqMhz()
	{
		return freqMhz;
	}

	/**
	 * @return the id
	 */
	public WifiId getId()
	{
		return id;
	}

	/**
	 * @return the leveldBm
	 */
	public int getLeveldBm()
	{
		return leveldBm;
	}

	/**
	 * @param freqMhz
	 *            the freqMhz to set
	 */
	public void setFreqMhz(int freqMhz)
	{
		this.freqMhz = freqMhz;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(WifiId id)
	{
		this.id = id;
	}

	/**
	 * @param leveldBm
	 *            the leveldBm to set
	 */
	public void setLeveldBm(int leveldBm)
	{
		this.leveldBm = leveldBm;
	}
}
