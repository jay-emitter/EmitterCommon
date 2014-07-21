package org.emitter.types;

import java.util.Arrays;

public class EmitReq {
	private WifiSignal[] wifi;
	private Source source;
	private String token;
	private Log log;
	private GPSCoord gps;
	private Timestamp time;
	
	public EmitReq() {
		super();
		this.setTime(new Timestamp());
	}
	/**
	 * @param wifi
	 * @param source
	 * @param token
	 */
	public EmitReq(WifiSignal[] wifi, Source source, String token) {
		super();
		this.wifi = wifi;
		this.source = source;
		this.token = token;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result + Arrays.hashCode(wifi);
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmitReq other = (EmitReq) obj;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (!Arrays.equals(wifi, other.wifi))
			return false;
		return true;
	}
	/**
	 * @return the wifi
	 */
	public WifiSignal[] getWifi() {
		return wifi;
	}
	/**
	 * @param wifi the wifi to set
	 */
	public void setWifi(WifiSignal[] wifi) {
		this.wifi = wifi;
	}
	/**
	 * @return the source
	 */
	public Source getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(Source source) {
		this.source = source;
	}
	
	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
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

	/**
	 * @return the gps
	 */
	public GPSCoord getGps() {
		return gps;
	}
	/**
	 * @param gps the gps to set
	 */
	public void setGps(GPSCoord gps) {
		this.gps = gps;
	}
	/**
	 * @return the log
	 */
	public Log getLog() {
		return log;
	}
	/**
	 * @param log the log to set
	 */
	public void setLog(Log log) {
		this.log = log;
	}

	
}
