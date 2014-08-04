package org.emitter.types;

/**
 * @author jeremy
 *
 */
public class AppConfig
{
	private boolean acceptsMessages;
	
	/**
	 * 
	 */
	public AppConfig()
	{
		acceptsMessages = false;
	}

	/**
	 * @return the acceptsMessages
	 */
	public boolean isAcceptsMessages()
	{
		return acceptsMessages;
	}

	/**
	 * @param acceptsMessages the acceptsMessages to set
	 */
	public void setAcceptsMessages(boolean acceptsMessages)
	{
		this.acceptsMessages = acceptsMessages;
	}
}
