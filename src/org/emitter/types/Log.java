package org.emitter.types;

import com.google.gson.annotations.Since;

public class Log
{
	@Since(1.0) private String[]	lines;
	@Since(1.0) private String		programName;

	public Log()
	{

	}

	/**
	 * @return the lines
	 */
	public String[] getLines()
	{
		return lines;
	}

	/**
	 * @return the programName
	 */
	public String getProgramName()
	{
		return programName;
	}

	/**
	 * @param lines
	 *            the lines to set
	 */
	public void setLines(String[] lines)
	{
		this.lines = lines;
	}

	/**
	 * @param programName
	 *            the programName to set
	 */
	public void setProgramName(String programName)
	{
		this.programName = programName;
	}

}
