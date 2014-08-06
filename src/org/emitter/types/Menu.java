/**
 * 
 */
package org.emitter.types;

import java.util.Arrays;

import com.google.gson.annotations.Since;

/**
 * @author jeremy
 * 
 */
public class Menu
{

	@Since(1.0) private MenuBlock[]	blocks;
	@Since(1.0) private MenuId		id;

	/**
	 * 
	 */
	public Menu()
	{
		super();
	}

	/**
	 * @param blocks
	 * @param menuId
	 */
	public Menu(MenuBlock[] blocks, int menuId)
	{
		super();
		this.blocks = blocks;
		this.id = new MenuId();
		id.setMenuId(menuId);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
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
	public MenuBlock[] getBlocks()
	{
		return blocks;
	}

	/**
	 * @return the id
	 */
	public MenuId getId()
	{
		return id;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(blocks);
		result = prime * result + id.hashCode();
		return result;
	}

	/**
	 * @param blocks
	 *            the blocks to set
	 */
	public void setBlocks(MenuBlock[] blocks)
	{
		this.blocks = blocks;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(MenuId id)
	{
		this.id = id;
	}

}
