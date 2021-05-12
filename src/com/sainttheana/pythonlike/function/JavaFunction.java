package com.sainttheana.pythonlike.function;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;

public class JavaFunction extends AbstractFunction
{
	protected Method method;
	protected String name;
	private Object receiver;
	protected int numParams;
	public JavaFunction(String n, Method m, Object receiver)
	{
		name = n;
		method = m;
		numParams = m.getParameterTypes().length;
		this.receiver = receiver;
	}
	public JavaFunction(String n, Method m)
	{
		name = n;
		method = m;
		numParams = m.getParameterTypes().length;
	}
	@Override public String toString()
	{ 
		return ""; 
	}
	public int numOfParameters()
	{
		return numParams;
	} 
	
	@Override public Object invoke(Object[] args)
	{
		try
		{
			Object g = method.invoke(receiver, args);
			if (g == null)
			{
				return "";
			}
			//DebugLoger.d("invoked",(String)g);
			return g;
		}
		catch (Exception e)
		{
			e.printStackTrace();
			StringWriter i = new StringWriter();
			PrintWriter y = new PrintWriter(i);
			e.printStackTrace(y);
			throw new RuntimeException("bad native function call: " + name + "\n" + i.toString());
		}
	}

}
