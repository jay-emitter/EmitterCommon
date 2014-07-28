/**
 * 
 */
package org.emitter.types;

import java.util.Arrays;

/**
 * @author jeremy
 *
 */
public class Menu 
{

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(blocks);
		result = prime * result + id.hashCode();
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
		Menu other = (Menu) obj;
		if (!Arrays.equals(blocks, other.blocks))
			return false;
		if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/**
	 * @return the blocks
	 */
	public MenuBlock[] getBlocks() {
		return blocks;
	}
	/**
	 * @param blocks the blocks to set
	 */
	public void setBlocks(MenuBlock[] blocks) {
		this.blocks = blocks;
	}
	
	/**
	 * @return the id
	 */
	public MenuId getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(MenuId id) {
		this.id = id;
	}
	
	/**
	 * 
	 */
	public Menu() {
		super();
	}
	
	/**
	 * @param blocks
	 * @param menuId
	 */
	public Menu(MenuBlock[] blocks, int menuId) {
		super();
		this.blocks = blocks;
		this.id = new MenuId();
		id.setMenuId(menuId);
	}
	private MenuBlock[] blocks;
	private MenuId id;

	
}
