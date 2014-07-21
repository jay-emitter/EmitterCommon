package org.emitter.types;

public class Log {
	private String[] lines;
	private String programName;
	public Log() {
	
	}
	/**
	 * @return the programName
	 */
	public String getProgramName() {
		return programName;
	}
	/**
	 * @param programName the programName to set
	 */
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	/**
	 * @return the lines
	 */
	public String[] getLines() {
		return lines;
	}
	/**
	 * @param lines the lines to set
	 */
	public void setLines(String[] lines) {
		this.lines = lines;
	}

}
