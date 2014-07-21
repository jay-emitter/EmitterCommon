package org.emitter.types;

import java.io.Serializable;

public class MenuId implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7276782999462122978L;
	private int menuId;
	public MenuId() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the menuId
	 */
	public int getMenuId() {
		return menuId;
	}
	/**
	 * @param menuId the menuId to set
	 */
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

}
