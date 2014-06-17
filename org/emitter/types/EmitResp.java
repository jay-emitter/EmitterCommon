package org.emitter.types;

import java.io.Serializable;

public class EmitResp implements Serializable{
	public enum Status
	{
		ACCEPTED
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -1729986470856026861L;
	private Location location;
	private Message message;
	private Status status;
	/**
	 * @param location
	 * @param menuId
	 * @param message
	 */
	public EmitResp(Location location, Message message) {
		super();
		this.location = location;
		this.message = message;
	}

	
	
	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}

	
	/**
	 * @return the message
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(Message message) {
		this.message = message;
	}

	public EmitResp() {
		super();
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
}
