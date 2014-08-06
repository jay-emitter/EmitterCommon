package org.emitter.types;

import com.google.gson.annotations.Since;

public class MenuId
{
	@Since(1.0) private int	menuId;

	public MenuId()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the menuId
	 */
	public int getMenuId()
	{
		return menuId;
	}

	/**
	 * @param menuId
	 *            the menuId to set
	 */
	public void setMenuId(int menuId)
	{
		this.menuId = menuId;
	}

}
