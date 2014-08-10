package org.emitter.error;

/**
 * 
 * @author jeremy
 *
 */
public class LoginRequiredException extends EmitterException
{

	/**
	 * 
	 * @param error
	 */
	public LoginRequiredException(String error)
	{
		super(error);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param error
	 * @param ex
	 */
	public LoginRequiredException(String error, Exception ex)
	{
		super(error, ex);
	}

}
