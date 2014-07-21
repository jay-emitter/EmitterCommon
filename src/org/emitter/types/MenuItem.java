/**
 * 
 */
package org.emitter.types;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author jeremy
 *
 */
public class MenuItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3668270693759526585L;

	/**
	 * 
	 */
	public MenuItem() {
		super();
	}

	/**
	 * @param name
	 * @param price
	 * @param allowCusomization
	 */
	public MenuItem(String name, BigDecimal price, boolean allowCusomization) {
		super();
		this.name = name;
		this.price = price;
		this.allowCusomization = allowCusomization;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (allowCusomization ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		MenuItem other = (MenuItem) obj;
		if (allowCusomization != other.allowCusomization)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * @return the allowCusomization
	 */
	public boolean isAllowCusomization() {
		return allowCusomization;
	}
	/**
	 * @param allowCusomization the allowCusomization to set
	 */
	public void setAllowCusomization(boolean allowCusomization) {
		this.allowCusomization = allowCusomization;
	}

	String name;
	BigDecimal price;
	boolean allowCusomization;
	
}
