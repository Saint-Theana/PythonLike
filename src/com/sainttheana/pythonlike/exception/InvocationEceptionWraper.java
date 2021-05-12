package com.sainttheana.pythonlike.exception;

public class InvocationEceptionWraper extends RuntimeException
{

	public Throwable e;
	
	public InvocationEceptionWraper(Throwable cause)
	{
		this.e=cause;
	}
}
