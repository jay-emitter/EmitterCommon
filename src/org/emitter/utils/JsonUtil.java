package org.emitter.utils;

import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;

import org.emitter.error.EmitterException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

/**
 * 
 * @author Jeremy
 * 
 */
public class JsonUtil
{
	/**
	 *  LATEST VERSION AVAILABLE
	 */
	static public final double LATEST_VERSION = 1.0;
	
	static private GsonBuilder	g		= null;
	static private Gson			gson	= null;
	static private double 		version = LATEST_VERSION;  // Default to latest
	
	private static Gson get() throws EmitterException
	{
		if (gson == null)
		{
			build();
		}
		return gson;
	}
	
	private static synchronized void build() throws EmitterException
	{
		if (gson == null)
		{
			if (g == null)
			{
				g = new GsonBuilder();
			}
			gson = g.serializeNulls().setVersion(version).create();
		}
	}
	
	/**
	 * @return true if version should be set
	 */
	public static synchronized boolean shouldSetVersion()
	{
		return (g == null && gson == null);
	}
	
	/**
	 * @param d the version number of the serialization version to use (will serialize all version < d)
	 * @throws EmitterException if version has already be set
	 */
	public static synchronized void setVersion(double d) throws EmitterException
	{
		if(Double.compare(LATEST_VERSION, d) < 0)
		{
			throw new EmitterException("Invalid version number. LATEST_VERSION is " + d);
		}
		if(shouldSetVersion())
		{
			version = d;
		}
		else if(Double.compare(d, version) != 0) //if its's the same version, no harm, no foul
		{
			throw new EmitterException("Version already set and cannot be changed");
		}
	}

	/**
	 * @param r
	 * @param cl the class
	 * @return An object of Type T
	 * @throws EmitterException if version is not set or if deserialization fails
	 */
	public static <T> T from(Reader r, Class<T> cl) throws EmitterException
	{
		try
		{
			return get().fromJson(r, cl);
		}
		catch (Exception ex)
		{
			throw new EmitterException("Could read json to object", ex);
		}
	}
	
	

	/**
	 * @param j
	 * @return An object of type T
	 * @throws EmitterException if version is not set, or if deserialization fails
	 */
	public static <T> T from(String j, Class<T> cl) throws EmitterException
	{	
		return get().fromJson(j, cl);
	}

	/**
	 * @param ob
	 * @return The json representation of object ob
	 * @throws EmitterException if version is not set or serialization fails
	 */
	public static <T> String to(T ob) throws EmitterException
	{
		try
		{
			Type t = new TypeToken<T>() {}.getType();
			return get().toJson(ob, t);
		}
		catch (Exception ex)
		{
			throw new EmitterException("Could not convert object to Json", ex);
		}
	}

	/**
	 * @param ob
	 * @param w The writer where the json representation of object ob will be written
	 * @throws EmitterException if version is not set or if serialization fails
	 */
	public static <T> void to(T ob, Writer w) throws EmitterException
	{
		try
		{
			Type t = new TypeToken<T>() {}.getType();
			get().toJson(ob, t, w);
		}
		catch (Exception ex)
		{
			throw new EmitterException("Could not write object to json", ex);
		}
	}

}
