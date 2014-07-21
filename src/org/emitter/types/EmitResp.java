package org.emitter.types;


public class EmitResp{
	public enum Status
	{
		ACCEPTED
	}
	/**
	 * 
	 */
	private Location location;
	private Message[] message;
	private Status status;
	
	
	/**
	 * 
	 */
	public EmitResp() {
		super();
	}
	
	/**
	 * @param location
	 * @param message
	 */
	public EmitResp(Location location, Message message) {
		super();
		this.location = location;
		this.message = new Message[] { message};
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
	public Message[] getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(Message[] message) {
		this.message = message;
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
