package org.emitter.utils;

import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;

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
	static GsonBuilder g = null;
	static Gson gson = null;
	private static synchronized void build()
	{
		if(gson == null)
		{
			if(g == null)
			{
				g = new GsonBuilder();
			}
			gson = g.create();
		}
	}
	
	private static Gson get()
	{
		if(gson == null)
			build();
		return gson;
	}
	
	public static <T> void to(T ob, Writer w)
	{
		Type t = new TypeToken<T>() {}.getType();
		get().toJson(ob, t, w);
	}

	
	public static <T> String to(T ob)
	{
		Type t = new TypeToken<T>() {}.getType();
		return get().toJson(ob, t);
	}
	
	public static String to(Object ob, Type t)
	{
		return get().toJson(ob, t);
	}
	
	public static <T> T from(String j)
	{
		return get().fromJson(j,new TypeToken<T>() {}.getType());
	}

	public static <T> T from(Reader r)
	{
		Type classOfT = null;
		return get().fromJson(r, classOfT);
	}
	
	
}
