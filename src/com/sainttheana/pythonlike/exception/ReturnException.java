package com.sainttheana.pythonlike.exception;

public class ReturnException extends RuntimeException
{

	public Object obj;

	public ReturnException(Object obj)
	{
		this.obj = obj;
	}
}
