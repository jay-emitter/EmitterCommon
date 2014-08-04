package org.emitter.types;

public class EmitResp
{
	public enum Status
	{
		ACCEPTED
	}

	private Location	location;
	private Message[]	message;
	private Status		status;
	/**
	 * 
	 */
	private String		token;

	/**
	 * 
	 */
	public EmitResp()
	{
		super();
	}

	/**
	 * @param location
	 * @param message
	 */
	public EmitResp(Location location, Message message)
	{
		super();
		this.location = location;
		this.message = new Message[] { message };
	}

	/**
	 * @return the location
	 */
	public Location getLocation()
	{
		return location;
	}

	/**
	 * @return the message
	 */
	public Message[] getMessage()
	{
		return message;
	}

	/**
	 * @return the status
	 */
	public Status getStatus()
	{
		return status;
	}

	public String getToken()
	{
		return token;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(Location location)
	{
		this.location = location;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(Message[] message)
	{
		this.message = message;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Status status)
	{
		this.status = status;
	}

	public void setToken(String token)
	{
		this.token = token;
	}
}
