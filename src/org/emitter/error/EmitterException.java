package org.emitter.error;

public class EmitterException extends Exception
{

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 1L;

	public EmitterException(String error)
	{
		super(error);
	}

	public EmitterException(String error, Exception ex)
	{
		super(error, ex);
	}
}
