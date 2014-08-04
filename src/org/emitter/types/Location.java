package org.emitter.types;

public class Location
{
	private String	locId;
	private int		MenuId;
	private String	name;

	public Location()
	{

	}

	/**
	 * @return the locId
	 */
	public String getLocId()
	{
		return locId;
	}

	/**
	 * @return the menuId
	 */
	public int getMenuId()
	{
		return MenuId;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param locId
	 *            the locId to set
	 */
	public void setLocId(String locId)
	{
		this.locId = locId;
	}

	/**
	 * @param menuId
	 *            the menuId to set
	 */
	public void setMenuId(int menuId)
	{
		MenuId = menuId;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

}
