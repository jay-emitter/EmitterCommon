package org.emitter.types;

public class WifiSignal implements Comparable<WifiSignal>{
	private WifiId id;
	private int leveldBm;
	private int freqMhz;
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
	public WifiSignal(String bSSID, String sSID, int leveldBm, int freqMhz) {
		super();
		this. id = new WifiId(bSSID, sSID);
		this.leveldBm = leveldBm;
		this.freqMhz = freqMhz;
	}
	

	/**
	 * @return the freqMhz
	 */
	public int getFreqMhz() {
		return freqMhz;
	}

	/**
	 * @param freqMhz the freqMhz to set
	 */
	public void setFreqMhz(int freqMhz) {
		this.freqMhz = freqMhz;
	}

	/**
	 * @return the leveldBm
	 */
	public int getLeveldBm() {
		return leveldBm;
	}

	/**
	 * @param leveldBm the leveldBm to set
	 */
	public void setLeveldBm(int leveldBm) {
		this.leveldBm = leveldBm;
	}


	@Override
	public int compareTo(WifiSignal arg0) {
		return  arg0.leveldBm - leveldBm;
	}


	/**
	 * @return the id
	 */
	public WifiId getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(WifiId id) {
		this.id = id;
	}
}
