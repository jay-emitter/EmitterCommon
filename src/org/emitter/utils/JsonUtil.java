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

	private static synchronized void build()
	{
		if (gson == null)
		{
			if (g == null)
			{
				g = new GsonBuilder();
			}
			gson = g.create();
		}
	}

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

	private static Gson get()
	{
		if (gson == null)
		{
			build();
		}
		return gson;
	}

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
