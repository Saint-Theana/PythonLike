package com.sainttheana.pythonlike.function;

public class FuseableJavaFunction extends AbstractFunction
{

	@Override
	public Object invoke(Object[] params)
	{
		return null;
	}

	@Override
	public int numOfParameters()
	{
		return 0;
	}
	
	
	public interface Invocation{
		Object invoke(Object[] params);
	}
}
