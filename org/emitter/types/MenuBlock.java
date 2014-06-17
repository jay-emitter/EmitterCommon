package org.emitter.types;

import java.io.Serializable;
import java.util.Arrays;

public class MenuBlock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6908181413724316003L;

	public MenuBlock() {
		super();
	}
	
	
	/**
	 * @param header
	 * @param items
	 * @param subBlocks
	 */
	public MenuBlock(String header, MenuItem[] items, MenuBlock[] subBlocks) {
		super();
		this.header = header;
		this.items = items;
		this.subBlocks = subBlocks;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + Arrays.hashCode(items);
		result = prime * result + Arrays.hashCode(subBlocks);
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
		MenuBlock other = (MenuBlock) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (!Arrays.equals(items, other.items))
			return false;
		if (!Arrays.equals(subBlocks, other.subBlocks))
			return false;
		return true;
	}


	/**
	 * @return the header
	 */
	public String getHeader() {
		return header;
	}
	/**
	 * @param header the header to set
	 */
	public void setHeader(String header) {
		this.header = header;
	}
	/**
	 * @return the items
	 */
	public MenuItem[] getItems() {
		return items;
	}
	/**
	 * @param items the items to set
	 */
	public void setItems(MenuItem[] items) {
		this.items = items;
	}
	/**
	 * @return the subBlocks
	 */
	public MenuBlock[] getSubBlocks() {
		return subBlocks;
	}
	/**
	 * @param subBlocks the subBlocks to set
	 */
	public void setSubBlocks(MenuBlock[] subBlocks) {
		this.subBlocks = subBlocks;
	}


	String header;
	MenuItem items[];
	MenuBlock subBlocks[];
}