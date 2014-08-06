package org.emitter.utils;

import java.io.Reader;
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
	static GsonBuilder	g		= null;
	static Gson			gson	= null;
	static double 		version = 1.0;
	
	private static Gson get()
	{
		if (gson == null)
		{
			build();
		}
		return gson;
	}
	
	private static synchronized void build()
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
	 * @param d the version number of the serialization version to use (will serialize all version < d)
	 */
	public static synchronized void setVersion(double d)
	{
		if(Double.compare(version, d) != 0)
		{
			g = null;
			gson = null;
			version = d;
		}
	}

	/**
	 * @param r
	 * @return An object of Type T
	 * @throws EmitterException
	 */
	public static <T> T from(Reader r) throws EmitterException
	{
		try
		{
			Type t = new TypeToken<T>() {
			}.getType();
			return get().fromJson(r, t);
		}
		catch (Exception ex)
		{
			throw new EmitterException("Could read json to object", ex);
		}
	}

	/**
	 * @param j
	 * @return An object of type T
	 * @throws EmitterException
	 */
	public static <T> T from(String j) throws EmitterException
	{
		try
		{
			return get().fromJson(j, new TypeToken<T>() {
			}.getType());
		}
		catch (Exception ex)
		{
			throw new EmitterException(
					"Could not convert json to Object. String was: " + j, ex);
		}
	}

	/**
	 * @param ob
	 * @return The json representation of object ob
	 * @throws EmitterException
	 */
	public static <T> String to(T ob) throws EmitterException
	{
		try
		{
			Type t = new TypeToken<T>() {
			}.getType();
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
	 * @throws EmitterException
	 */
	public static <T> void to(T ob, Writer w) throws EmitterException
	{
		try
		{
			Type t = new TypeToken<T>() {
			}.getType();
			get().toJson(ob, t, w);
		}
		catch (Exception ex)
		{
			throw new EmitterException("Could not write object to json", ex);
		}
	}

}
