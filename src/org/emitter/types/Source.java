/**
 * 
 */
package org.emitter.types;

import java.io.Serializable;

/**
 * @author jeremy
 *
 */
public class Source implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2157021743141897518L;

	/**
	 * 
	 */
	public Source() {
		super();
	}

	
	/**
	 * @param _userKey
	 * @param programKey
	 * @param _deviceKey
	 */
	public Source(String _userKey, String _programKey, String _deviceKey) {
		super();
		userKey = _userKey;
		programKey = _programKey;
		deviceKey = _deviceKey;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((deviceKey == null) ? 0 : deviceKey.hashCode());
		result = prime * result
				+ ((programKey == null) ? 0 : programKey.hashCode());
		result = prime * result + ((userKey == null) ? 0 : userKey.hashCode());
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
		Source other = (Source) obj;
		if (deviceKey == null) {
			if (other.deviceKey != null)
				return false;
		} else if (!deviceKey.equals(other.deviceKey))
			return false;
		if (programKey == null) {
			if (other.programKey != null)
				return false;
		} else if (!programKey.equals(other.programKey))
			return false;
		if (userKey == null) {
			if (other.userKey != null)
				return false;
		} else if (!userKey.equals(other.userKey))
			return false;
		return true;
	}


	/**
	 * @return the userKey
	 */
	public String getUserKey() {
		return userKey;
	}
	/**
	 * @param userKey the userKey to set
	 */
	public void setUserKey(String _userKey) {
		userKey = _userKey;
	}
	/**
	 * @return the programKey
	 */
	public String getProgramKey() {
		return programKey;
	}
	/**
	 * @param programKey the programKey to set
	 */
	public void setProgramKey(String _programKey) {
		programKey = _programKey;
	}
	/**
	 * @return the deviceKey
	 */
	public String getDeviceKey() {
		return deviceKey;
	}
	/**
	 * @param _deviceKey the deviceKey to set
	 */
	public void setDeviceKey(String _deviceKey) {
		deviceKey = _deviceKey;
	}


	private String userKey;
	private String programKey;
	private String deviceKey;
}
