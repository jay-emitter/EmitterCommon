package org.emitter.types;

import com.google.gson.annotations.Since;

/**
 * @author jeremy
 *
 */
public class AppConfig
{
	@Since(1.0) private boolean acceptsMessages;
	
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
