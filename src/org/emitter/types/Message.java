package org.emitter.types;

import com.google.gson.annotations.Since;

public class Message
{
	@Since(1.0) private int		msgId;
	@Since(1.0) private String	text;

	@Since(1.0) private String	title;

	public Message()
	{
		super();
	}

	/**
	 * @param text
	 * @param title
	 */
	public Message(String text, String title)
	{
		this(text, title, -1);
	}

	/**
	 * @param text
	 * @param title
	 */
	public Message(String text, String title, int id)
	{
		super();
		this.text = text;
		this.title = title;
		this.msgId = id;
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
		Message other = (Message) obj;
		if (text == null)
		{
			if (other.text != null)
				return false;
		}
		else if (!text.equals(other.text))
			return false;
		if (title == null)
		{
			if (other.title != null)
				return false;
		}
		else if (!title.equals(other.title))
			return false;
		return true;
	}

	/**
	 * @return the msgId
	 */
	public int getMsgId()
	{
		return msgId;
	}

	/**
	 * @return the text
	 */
	public String getText()
	{
		return text;
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
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
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/**
	 * @param msgId
	 *            the msgId to set
	 */
	public void setMsgId(int msgId)
	{
		this.msgId = msgId;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text)
	{
		this.text = text;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
}
